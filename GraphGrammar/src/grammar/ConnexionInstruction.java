/**
 */
package grammar;

import graph.Node;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connexion Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grammar.ConnexionInstruction#getParentEmbedding <em>Parent Embedding</em>}</li>
 *   <li>{@link grammar.ConnexionInstruction#getM <em>M</em>}</li>
 *   <li>{@link grammar.ConnexionInstruction#getD <em>D</em>}</li>
 * </ul>
 *
 * @see grammar.GrammarPackage#getConnexionInstruction()
 * @model
 * @generated
 */
public interface ConnexionInstruction extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Embedding</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link grammar.Embedding#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Embedding</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Embedding</em>' container reference.
	 * @see #setParentEmbedding(Embedding)
	 * @see grammar.GrammarPackage#getConnexionInstruction_ParentEmbedding()
	 * @see grammar.Embedding#getInstructions
	 * @model opposite="instructions" required="true" transient="false"
	 * @generated
	 */
	Embedding getParentEmbedding();

	/**
	 * Sets the value of the '{@link grammar.ConnexionInstruction#getParentEmbedding <em>Parent Embedding</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Embedding</em>' container reference.
	 * @see #getParentEmbedding()
	 * @generated
	 */
	void setParentEmbedding(Embedding value);

	/**
	 * Returns the value of the '<em><b>M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>M</em>' attribute.
	 * @see #setM(String)
	 * @see grammar.GrammarPackage#getConnexionInstruction_M()
	 * @model
	 * @generated
	 */
	String getM();

	/**
	 * Sets the value of the '{@link grammar.ConnexionInstruction#getM <em>M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>M</em>' attribute.
	 * @see #getM()
	 * @generated
	 */
	void setM(String value);

	/**
	 * Returns the value of the '<em><b>D</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>D</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>D</em>' reference.
	 * @see #setD(Node)
	 * @see grammar.GrammarPackage#getConnexionInstruction_D()
	 * @model
	 * @generated
	 */
	Node getD();

	/**
	 * Sets the value of the '{@link grammar.ConnexionInstruction#getD <em>D</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>D</em>' reference.
	 * @see #getD()
	 * @generated
	 */
	void setD(Node value);

} // ConnexionInstruction
