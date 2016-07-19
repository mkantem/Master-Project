/**
 */
package grammar;

import graph.Named;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grammar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grammar.Grammar#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see grammar.GrammarPackage#getGrammar()
 * @model
 * @generated
 */
public interface Grammar extends Named {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link grammar.Rule}.
	 * It is bidirectional and its opposite is '{@link grammar.Rule#getParentGrammar <em>Parent Grammar</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see grammar.GrammarPackage#getGrammar_Rules()
	 * @see grammar.Rule#getParentGrammar
	 * @model opposite="parentGrammar" containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

} // Grammar
