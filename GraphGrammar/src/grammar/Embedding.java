/**
 */
package grammar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Embedding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grammar.Embedding#getParentRule <em>Parent Rule</em>}</li>
 *   <li>{@link grammar.Embedding#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @see grammar.GrammarPackage#getEmbedding()
 * @model
 * @generated
 */
public interface Embedding extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link grammar.Rule#getEmbeddingMechanism <em>Embedding Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Rule</em>' container reference.
	 * @see #setParentRule(Rule)
	 * @see grammar.GrammarPackage#getEmbedding_ParentRule()
	 * @see grammar.Rule#getEmbeddingMechanism
	 * @model opposite="EmbeddingMechanism" required="true" transient="false"
	 * @generated
	 */
	Rule getParentRule();

	/**
	 * Sets the value of the '{@link grammar.Embedding#getParentRule <em>Parent Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Rule</em>' container reference.
	 * @see #getParentRule()
	 * @generated
	 */
	void setParentRule(Rule value);

	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link grammar.ConnexionInstruction}.
	 * It is bidirectional and its opposite is '{@link grammar.ConnexionInstruction#getParentEmbedding <em>Parent Embedding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see grammar.GrammarPackage#getEmbedding_Instructions()
	 * @see grammar.ConnexionInstruction#getParentEmbedding
	 * @model opposite="parentEmbedding" containment="true"
	 * @generated
	 */
	EList<ConnexionInstruction> getInstructions();

} // Embedding
