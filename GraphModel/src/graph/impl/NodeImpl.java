/**
 */
package graph.impl;

import graph.Edge;
import graph.Graph;
import graph.GraphPackage;
import graph.Node;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graph.impl.NodeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link graph.impl.NodeImpl#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 *   <li>{@link graph.impl.NodeImpl#getIngoingEdges <em>Ingoing Edges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends TypedImpl implements Node {
	private int marker = 0;
	
	public  void markNode(){marker=1;}
	public  void unMarkNode(){marker=0;}
	public  int Mark(){return marker;}
	
	@Override
	public boolean equals(Object o) {
		if(! (o instanceof Node) ) return false;
		Node n =(Node)o;
		if(n==null)return false;
		else
		{
			if(n.getName()==null) return false;
			
			return n.getName().equals(this.getName());
		}
		
		
	}

	/**
	 * The cached value of the '{@link #getOutgoingEdges() <em>Outgoing Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> outgoingEdges;

	/**
	 * The cached value of the '{@link #getIngoingEdges() <em>Ingoing Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngoingEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> ingoingEdges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph getParent() {
		if (eContainerFeatureID() != GraphPackage.NODE__PARENT) return null;
		return (Graph)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Graph newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, GraphPackage.NODE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Graph newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != GraphPackage.NODE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, GraphPackage.GRAPH__NODES, Graph.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.NODE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getOutgoingEdges() {
		if (outgoingEdges == null) {
			outgoingEdges = new EObjectWithInverseResolvingEList<Edge>(Edge.class, this, GraphPackage.NODE__OUTGOING_EDGES, GraphPackage.EDGE__SOURCE);
		}
		return outgoingEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getIngoingEdges() {
		if (ingoingEdges == null) {
			ingoingEdges = new EObjectWithInverseResolvingEList<Edge>(Edge.class, this, GraphPackage.NODE__INGOING_EDGES, GraphPackage.EDGE__TARGET);
		}
		return ingoingEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphPackage.NODE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Graph)otherEnd, msgs);
			case GraphPackage.NODE__OUTGOING_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingEdges()).basicAdd(otherEnd, msgs);
			case GraphPackage.NODE__INGOING_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIngoingEdges()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphPackage.NODE__PARENT:
				return basicSetParent(null, msgs);
			case GraphPackage.NODE__OUTGOING_EDGES:
				return ((InternalEList<?>)getOutgoingEdges()).basicRemove(otherEnd, msgs);
			case GraphPackage.NODE__INGOING_EDGES:
				return ((InternalEList<?>)getIngoingEdges()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GraphPackage.NODE__PARENT:
				return eInternalContainer().eInverseRemove(this, GraphPackage.GRAPH__NODES, Graph.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphPackage.NODE__PARENT:
				return getParent();
			case GraphPackage.NODE__OUTGOING_EDGES:
				return getOutgoingEdges();
			case GraphPackage.NODE__INGOING_EDGES:
				return getIngoingEdges();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphPackage.NODE__PARENT:
				setParent((Graph)newValue);
				return;
			case GraphPackage.NODE__OUTGOING_EDGES:
				getOutgoingEdges().clear();
				getOutgoingEdges().addAll((Collection<? extends Edge>)newValue);
				return;
			case GraphPackage.NODE__INGOING_EDGES:
				getIngoingEdges().clear();
				getIngoingEdges().addAll((Collection<? extends Edge>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GraphPackage.NODE__PARENT:
				setParent((Graph)null);
				return;
			case GraphPackage.NODE__OUTGOING_EDGES:
				getOutgoingEdges().clear();
				return;
			case GraphPackage.NODE__INGOING_EDGES:
				getIngoingEdges().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraphPackage.NODE__PARENT:
				return getParent() != null;
			case GraphPackage.NODE__OUTGOING_EDGES:
				return outgoingEdges != null && !outgoingEdges.isEmpty();
			case GraphPackage.NODE__INGOING_EDGES:
				return ingoingEdges != null && !ingoingEdges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName();
	}

} //NodeImpl
