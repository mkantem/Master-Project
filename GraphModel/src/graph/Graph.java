/**
 */
package graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.Graph#getNodes <em>Nodes</em>}</li>
 *   <li>{@link graph.Graph#getEdges <em>Edges</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends Named {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link graph.Node}.
	 * It is bidirectional and its opposite is '{@link graph.Node#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see graph.GraphPackage#getGraph_Nodes()
	 * @see graph.Node#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link graph.Edge}.
	 * It is bidirectional and its opposite is '{@link graph.Edge#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see graph.GraphPackage#getGraph_Edges()
	 * @see graph.Edge#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Edge> getEdges();

} // Graph
