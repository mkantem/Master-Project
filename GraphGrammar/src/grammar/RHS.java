/**
 */
package grammar;

import graph.Graph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RHS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grammar.RHS#getParentRule <em>Parent Rule</em>}</li>
 *   <li>{@link grammar.RHS#getSubGraph <em>Sub Graph</em>}</li>
 * </ul>
 *
 * @see grammar.GrammarPackage#getRHS()
 * @model
 * @generated
 */
public interface RHS extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link grammar.Rule#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Rule</em>' container reference.
	 * @see #setParentRule(Rule)
	 * @see grammar.GrammarPackage#getRHS_ParentRule()
	 * @see grammar.Rule#getRhs
	 * @model opposite="rhs" required="true" transient="false"
	 * @generated
	 */
	Rule getParentRule();

	/**
	 * Sets the value of the '{@link grammar.RHS#getParentRule <em>Parent Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Rule</em>' container reference.
	 * @see #getParentRule()
	 * @generated
	 */
	void setParentRule(Rule value);

	/**
	 * Returns the value of the '<em><b>Sub Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Graph</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Graph</em>' reference.
	 * @see #setSubGraph(Graph)
	 * @see grammar.GrammarPackage#getRHS_SubGraph()
	 * @model required="true"
	 * @generated
	 */
	Graph getSubGraph();

	/**
	 * Sets the value of the '{@link grammar.RHS#getSubGraph <em>Sub Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Graph</em>' reference.
	 * @see #getSubGraph()
	 * @generated
	 */
	void setSubGraph(Graph value);

} // RHS
