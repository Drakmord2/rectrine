/*
 * generated by Xtext 2.12.0
 */
package poli.compiladores.rec.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import poli.compiladores.rec.rectrine.Entidade

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RectrineGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (e : resource.allContents.filter(Entidade).toIterable) {
			fsa.generateFile(e.name + ".php", e.compile)
		}
	}

	def compile(Entidade E) 
	'''
		<?php
		
		use Doctrine\ORM\Mapping as ORM
		
		/**
		* @ORM\Entity
		* @ORM\Table(name="«E.name»", options={"collate" => "utf8mb4_general_ci", "charset" => "utf8mb4"})
		**/
		class «E.name»
		{
		    «FOR C : E.campos SEPARATOR '\n'» 
		    «IF C.tipo.nullOrEmpty»
		        /**
		        «IF C.rel.ent1.name == E.name»
		        * @ORM\«C.rel.mul1.toFirstUpper»To«C.rel.mul2.toFirstUpper»(targetEntity="«C.rel.ent2.name»", inversedBy="«E.name.toLowerCase»", fetch"EXTRA_LAZY)
		        «ELSE»
		        * @ORM\«C.rel.mul1.toFirstUpper»To«C.rel.mul2.toFirstUpper»(targetEntity="«C.rel.ent2.name»", mappedBy="«E.name.toLowerCase»", fetch"EXTRA_LAZY)
		        «ENDIF»
		        **/
		    «ENDIF»
		    «IF ! C.tipo.nullOrEmpty»
		    		/**
		    		* @ORM\Column(name="«C.name»", type="«C.tipo»", nullable=false)
		    		**/
    		    «ENDIF»
		    private $«C.name»;
		    «ENDFOR»
		 
		    «E.getset»
		 
		}
		 
	'''
	
	def getset(Entidade E) 
	'''
		«FOR C : E.campos SEPARATOR '\n'»
		public function get«C.name.toFirstUpper»()
		{ 
		    return $this->«C.name»;
		}
		 
		«IF ! C.tipo.nullOrEmpty || C.rel.mul1 != "many" || C.rel.mul2 != "many"»
			public function set«C.name.toFirstUpper»($«C.name»)
			{ 
			    $this->«C.name» = $«C.name»;
			}
		«ELSE»
			public function add«C.name.toFirstUpper»($«C.name»)
			{ 
			    $this->«C.name»[] = $«C.name»;
			}
		«ENDIF»
		«ENDFOR»
	'''
}
