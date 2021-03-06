/**
 */
package org.casa.dsltesting.Qt48Xmlschema.impl;

import java.lang.String;
import java.util.Collection;
import org.casa.dsltesting.Qt48Xmlschema.Action;
import org.casa.dsltesting.Qt48Xmlschema.ActionGroup;
import org.casa.dsltesting.Qt48Xmlschema.Property;
import org.casa.dsltesting.Qt48Xmlschema.Qt48XmlschemaPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.ActionGroupImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.ActionGroupImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.ActionGroupImpl#getActiongroup <em>Actiongroup</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.ActionGroupImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.ActionGroupImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48Xmlschema.impl.ActionGroupImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionGroupImpl extends MinimalEObjectImpl.Container implements ActionGroup {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Qt48XmlschemaPackage.Literals.ACTION_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Qt48XmlschemaPackage.ACTION_GROUP__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getAction() {
		return getGroup().list(Qt48XmlschemaPackage.Literals.ACTION_GROUP__ACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionGroup> getActiongroup() {
		return getGroup().list(Qt48XmlschemaPackage.Literals.ACTION_GROUP__ACTIONGROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperty() {
		return getGroup().list(Qt48XmlschemaPackage.Literals.ACTION_GROUP__PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getAttribute() {
		return getGroup().list(Qt48XmlschemaPackage.Literals.ACTION_GROUP__ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Qt48XmlschemaPackage.ACTION_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Qt48XmlschemaPackage.ACTION_GROUP__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Qt48XmlschemaPackage.ACTION_GROUP__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case Qt48XmlschemaPackage.ACTION_GROUP__ACTIONGROUP:
				return ((InternalEList<?>)getActiongroup()).basicRemove(otherEnd, msgs);
			case Qt48XmlschemaPackage.ACTION_GROUP__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case Qt48XmlschemaPackage.ACTION_GROUP__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Qt48XmlschemaPackage.ACTION_GROUP__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Qt48XmlschemaPackage.ACTION_GROUP__ACTION:
				return getAction();
			case Qt48XmlschemaPackage.ACTION_GROUP__ACTIONGROUP:
				return getActiongroup();
			case Qt48XmlschemaPackage.ACTION_GROUP__PROPERTY:
				return getProperty();
			case Qt48XmlschemaPackage.ACTION_GROUP__ATTRIBUTE:
				return getAttribute();
			case Qt48XmlschemaPackage.ACTION_GROUP__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Qt48XmlschemaPackage.ACTION_GROUP__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Qt48XmlschemaPackage.ACTION_GROUP__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends Action>)newValue);
				return;
			case Qt48XmlschemaPackage.ACTION_GROUP__ACTIONGROUP:
				getActiongroup().clear();
				getActiongroup().addAll((Collection<? extends ActionGroup>)newValue);
				return;
			case Qt48XmlschemaPackage.ACTION_GROUP__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case Qt48XmlschemaPackage.ACTION_GROUP__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case Qt48XmlschemaPackage.ACTION_GROUP__NAME:
				setName((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case Qt48XmlschemaPackage.ACTION_GROUP__GROUP:
				getGroup().clear();
				return;
			case Qt48XmlschemaPackage.ACTION_GROUP__ACTION:
				getAction().clear();
				return;
			case Qt48XmlschemaPackage.ACTION_GROUP__ACTIONGROUP:
				getActiongroup().clear();
				return;
			case Qt48XmlschemaPackage.ACTION_GROUP__PROPERTY:
				getProperty().clear();
				return;
			case Qt48XmlschemaPackage.ACTION_GROUP__ATTRIBUTE:
				getAttribute().clear();
				return;
			case Qt48XmlschemaPackage.ACTION_GROUP__NAME:
				setName(NAME_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Qt48XmlschemaPackage.ACTION_GROUP__GROUP:
				return group != null && !group.isEmpty();
			case Qt48XmlschemaPackage.ACTION_GROUP__ACTION:
				return !getAction().isEmpty();
			case Qt48XmlschemaPackage.ACTION_GROUP__ACTIONGROUP:
				return !getActiongroup().isEmpty();
			case Qt48XmlschemaPackage.ACTION_GROUP__PROPERTY:
				return !getProperty().isEmpty();
			case Qt48XmlschemaPackage.ACTION_GROUP__ATTRIBUTE:
				return !getAttribute().isEmpty();
			case Qt48XmlschemaPackage.ACTION_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ActionGroupImpl
