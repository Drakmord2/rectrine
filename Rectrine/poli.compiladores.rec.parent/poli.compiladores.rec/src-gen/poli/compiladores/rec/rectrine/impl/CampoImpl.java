/**
 * generated by Xtext 2.12.0
 */
package poli.compiladores.rec.rectrine.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import poli.compiladores.rec.rectrine.Campo;
import poli.compiladores.rec.rectrine.Ligacao;
import poli.compiladores.rec.rectrine.RectrinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Campo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link poli.compiladores.rec.rectrine.impl.CampoImpl#getName <em>Name</em>}</li>
 *   <li>{@link poli.compiladores.rec.rectrine.impl.CampoImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link poli.compiladores.rec.rectrine.impl.CampoImpl#getRel <em>Rel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CampoImpl extends MinimalEObjectImpl.Container implements Campo
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipo()
   * @generated
   * @ordered
   */
  protected static final String TIPO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipo()
   * @generated
   * @ordered
   */
  protected String tipo = TIPO_EDEFAULT;

  /**
   * The cached value of the '{@link #getRel() <em>Rel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRel()
   * @generated
   * @ordered
   */
  protected Ligacao rel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CampoImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RectrinePackage.Literals.CAMPO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RectrinePackage.CAMPO__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTipo()
  {
    return tipo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTipo(String newTipo)
  {
    String oldTipo = tipo;
    tipo = newTipo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RectrinePackage.CAMPO__TIPO, oldTipo, tipo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ligacao getRel()
  {
    return rel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRel(Ligacao newRel, NotificationChain msgs)
  {
    Ligacao oldRel = rel;
    rel = newRel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RectrinePackage.CAMPO__REL, oldRel, newRel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRel(Ligacao newRel)
  {
    if (newRel != rel)
    {
      NotificationChain msgs = null;
      if (rel != null)
        msgs = ((InternalEObject)rel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RectrinePackage.CAMPO__REL, null, msgs);
      if (newRel != null)
        msgs = ((InternalEObject)newRel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RectrinePackage.CAMPO__REL, null, msgs);
      msgs = basicSetRel(newRel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RectrinePackage.CAMPO__REL, newRel, newRel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RectrinePackage.CAMPO__REL:
        return basicSetRel(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RectrinePackage.CAMPO__NAME:
        return getName();
      case RectrinePackage.CAMPO__TIPO:
        return getTipo();
      case RectrinePackage.CAMPO__REL:
        return getRel();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RectrinePackage.CAMPO__NAME:
        setName((String)newValue);
        return;
      case RectrinePackage.CAMPO__TIPO:
        setTipo((String)newValue);
        return;
      case RectrinePackage.CAMPO__REL:
        setRel((Ligacao)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RectrinePackage.CAMPO__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RectrinePackage.CAMPO__TIPO:
        setTipo(TIPO_EDEFAULT);
        return;
      case RectrinePackage.CAMPO__REL:
        setRel((Ligacao)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RectrinePackage.CAMPO__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RectrinePackage.CAMPO__TIPO:
        return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
      case RectrinePackage.CAMPO__REL:
        return rel != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", tipo: ");
    result.append(tipo);
    result.append(')');
    return result.toString();
  }

} //CampoImpl
