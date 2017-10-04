/**
 * generated by Xtext 2.12.0
 */
package poli.compiladores.rec.rectrine.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import poli.compiladores.rec.rectrine.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RectrineFactoryImpl extends EFactoryImpl implements RectrineFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RectrineFactory init()
  {
    try
    {
      RectrineFactory theRectrineFactory = (RectrineFactory)EPackage.Registry.INSTANCE.getEFactory(RectrinePackage.eNS_URI);
      if (theRectrineFactory != null)
      {
        return theRectrineFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RectrineFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RectrineFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RectrinePackage.PROGRAM: return createProgram();
      case RectrinePackage.ENTIDADE: return createEntidade();
      case RectrinePackage.CAMPO: return createCampo();
      case RectrinePackage.LIGACAO: return createLigacao();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entidade createEntidade()
  {
    EntidadeImpl entidade = new EntidadeImpl();
    return entidade;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Campo createCampo()
  {
    CampoImpl campo = new CampoImpl();
    return campo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ligacao createLigacao()
  {
    LigacaoImpl ligacao = new LigacaoImpl();
    return ligacao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RectrinePackage getRectrinePackage()
  {
    return (RectrinePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RectrinePackage getPackage()
  {
    return RectrinePackage.eINSTANCE;
  }

} //RectrineFactoryImpl
