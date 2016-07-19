/**
 */
package graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.Node#getParent <em>Parent</em>}</li>
 *   <li>{@link graph.Node#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 *   <li>{@link graph.Node#getIngoingEdges <em>Ingoing Edges</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends Typed {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link graph.Graph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Graph)
	 * @see graph.GraphPackage#getNode_Parent()
	 * @see graph.Graph#getNodes
	 * @model opposite="nodes" required="true" transient="false"
	 * @generated
	 */
	Graph getParent();

	/**
	 * Sets the value of the '{@link graph.Node#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Graph value);

	/**
	 * Returns the value of the '<em><b>Outgoing Edges</b></em>' reference list.
	 * The list contents are of type {@link graph.Edge}.
	 * It is bidirectional and its opposite is '{@link graph.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Edges</em>' reference list.
	 * @see graph.GraphPackage#getNode_OutgoingEdges()
	 * @see graph.Edge#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Edge> getOutgoingEdges();

	/**
	 * Returns the value of the '<em><b>Ingoing Edges</b></em>' reference list.
	 * The list contents are of type {@link graph.Edge}.
	 * It is bidirectional and its opposite is '{@link graph.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ingoing Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingoing Edges</em>' reference list.
	 * @see graph.GraphPackage#getNode_IngoingEdges()
	 * @see graph.Edge#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Edge> getIngoingEdges();

	public  void markNode();
	public  void unMarkNode();
	public  int Mark();

} // Node
