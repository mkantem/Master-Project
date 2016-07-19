/**
 */
package grammar;

import graph.Node;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LHS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grammar.LHS#getParentRule <em>Parent Rule</em>}</li>
 *   <li>{@link grammar.LHS#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see grammar.GrammarPackage#getLHS()
 * @model
 * @generated
 */
public interface LHS extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link grammar.Rule#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Rule</em>' container reference.
	 * @see #setParentRule(Rule)
	 * @see grammar.GrammarPackage#getLHS_ParentRule()
	 * @see grammar.Rule#getLhs
	 * @model opposite="lhs" required="true" transient="false"
	 * @generated
	 */
	Rule getParentRule();

	/**
	 * Sets the value of the '{@link grammar.LHS#getParentRule <em>Parent Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Rule</em>' container reference.
	 * @see #getParentRule()
	 * @generated
	 */
	void setParentRule(Rule value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(Node)
	 * @see grammar.GrammarPackage#getLHS_Node()
	 * @model required="true"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link grammar.LHS#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

} // LHS
