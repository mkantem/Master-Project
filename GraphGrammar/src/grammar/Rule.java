/**
 */
package grammar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grammar.Rule#getParentGrammar <em>Parent Grammar</em>}</li>
 *   <li>{@link grammar.Rule#getLhs <em>Lhs</em>}</li>
 *   <li>{@link grammar.Rule#getRhs <em>Rhs</em>}</li>
 *   <li>{@link grammar.Rule#getName <em>Name</em>}</li>
 *   <li>{@link grammar.Rule#getPriority <em>Priority</em>}</li>
 *   <li>{@link grammar.Rule#getEmbeddingMechanism <em>Embedding Mechanism</em>}</li>
 * </ul>
 *
 * @see grammar.GrammarPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Grammar</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link grammar.Grammar#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Grammar</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Grammar</em>' container reference.
	 * @see #setParentGrammar(Grammar)
	 * @see grammar.GrammarPackage#getRule_ParentGrammar()
	 * @see grammar.Grammar#getRules
	 * @model opposite="rules" required="true" transient="false"
	 * @generated
	 */
	Grammar getParentGrammar();

	/**
	 * Sets the value of the '{@link grammar.Rule#getParentGrammar <em>Parent Grammar</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Grammar</em>' container reference.
	 * @see #getParentGrammar()
	 * @generated
	 */
	void setParentGrammar(Grammar value);

	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link grammar.LHS#getParentRule <em>Parent Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(LHS)
	 * @see grammar.GrammarPackage#getRule_Lhs()
	 * @see grammar.LHS#getParentRule
	 * @model opposite="parentRule" containment="true" required="true"
	 * @generated
	 */
	LHS getLhs();

	/**
	 * Sets the value of the '{@link grammar.Rule#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(LHS value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link grammar.RHS#getParentRule <em>Parent Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(RHS)
	 * @see grammar.GrammarPackage#getRule_Rhs()
	 * @see grammar.RHS#getParentRule
	 * @model opposite="parentRule" containment="true" required="true"
	 * @generated
	 */
	RHS getRhs();

	/**
	 * Sets the value of the '{@link grammar.Rule#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(RHS value);

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
	 * @see grammar.GrammarPackage#getRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link grammar.Rule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see grammar.GrammarPackage#getRule_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link grammar.Rule#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Embedding Mechanism</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link grammar.Embedding#getParentRule <em>Parent Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embedding Mechanism</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embedding Mechanism</em>' containment reference.
	 * @see #setEmbeddingMechanism(Embedding)
	 * @see grammar.GrammarPackage#getRule_EmbeddingMechanism()
	 * @see grammar.Embedding#getParentRule
	 * @model opposite="ParentRule" containment="true" required="true"
	 * @generated
	 */
	Embedding getEmbeddingMechanism();

	/**
	 * Sets the value of the '{@link grammar.Rule#getEmbeddingMechanism <em>Embedding Mechanism</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedding Mechanism</em>' containment reference.
	 * @see #getEmbeddingMechanism()
	 * @generated
	 */
	void setEmbeddingMechanism(Embedding value);
	
	public  void zeroMarkRule();
	public  void unMarkRule();
	public  int Mark();

} // Rule
