/**
 */
package org.casa.dsltesting.Qt48XmlschemaQwtEnhanced;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Resources#getInclude <em>Include</em>}</li>
 *   <li>{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Resources#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage#getResources()
 * @model extendedMetaData="name='Resources' kind='elementOnly'"
 * @generated
 */
public interface Resources extends EObject {
	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference list.
	 * The list contents are of type {@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' containment reference list.
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage#getResources_Include()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='include' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Resource> getInclude();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Qt48XmlschemaQwtEnhancedPackage#getResources_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.casa.dsltesting.Qt48XmlschemaQwtEnhanced.Resources#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Resources
