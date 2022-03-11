/**
 */
package fr.alma.web.webmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.alma.web.webmodel.Page#getTitle <em>Title</em>}</li>
 *   <li>{@link fr.alma.web.webmodel.Page#getArticles <em>Articles</em>}</li>
 * </ul>
 *
 * @see fr.alma.web.webmodel.ModelePackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see fr.alma.web.webmodel.ModelePackage#getPage_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link fr.alma.web.webmodel.Page#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Articles</b></em>' containment reference list.
	 * The list contents are of type {@link fr.alma.web.webmodel.Article}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Articles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Articles</em>' containment reference list.
	 * @see fr.alma.web.webmodel.ModelePackage#getPage_Articles()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Article> getArticles();

} // Page
