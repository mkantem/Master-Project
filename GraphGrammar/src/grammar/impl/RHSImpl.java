/**
 */
package grammar.impl;

import grammar.GrammarPackage;
import grammar.RHS;
import grammar.Rule;

import graph.Graph;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RHS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link grammar.impl.RHSImpl#getParentRule <em>Parent Rule</em>}</li>
 *   <li>{@link grammar.impl.RHSImpl#getSubGraph <em>Sub Graph</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RHSImpl extends MinimalEObjectImpl.Container implements RHS {
	/**
	 * The cached value of the '{@link #getSubGraph() <em>Sub Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubGraph()
	 * @generated
	 * @ordered
	 */
	protected Graph subGraph;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RHSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.RHS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getParentRule() {
		if (eContainerFeatureID() != GrammarPackage.RHS__PARENT_RULE) return null;
		return (Rule)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentRule(Rule newParentRule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentRule, GrammarPackage.RHS__PARENT_RULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentRule(Rule newParentRule) {
		if (newParentRule != eInternalContainer() || (eContainerFeatureID() != GrammarPackage.RHS__PARENT_RULE && newParentRule != null)) {
			if (EcoreUtil.isAncestor(this, newParentRule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentRule != null)
				msgs = ((InternalEObject)newParentRule).eInverseAdd(this, GrammarPackage.RULE__RHS, Rule.class, msgs);
			msgs = basicSetParentRule(newParentRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.RHS__PARENT_RULE, newParentRule, newParentRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph getSubGraph() {
		if (subGraph != null && subGraph.eIsProxy()) {
			InternalEObject oldSubGraph = (InternalEObject)subGraph;
			subGraph = (Graph)eResolveProxy(oldSubGraph);
			if (subGraph != oldSubGraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.RHS__SUB_GRAPH, oldSubGraph, subGraph));
			}
		}
		return subGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph basicGetSubGraph() {
		return subGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubGraph(Graph newSubGraph) {
		Graph oldSubGraph = subGraph;
		subGraph = newSubGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.RHS__SUB_GRAPH, oldSubGraph, subGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrammarPackage.RHS__PARENT_RULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentRule((Rule)otherEnd, msgs);
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
			case GrammarPackage.RHS__PARENT_RULE:
				return basicSetParentRule(null, msgs);
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
			case GrammarPackage.RHS__PARENT_RULE:
				return eInternalContainer().eInverseRemove(this, GrammarPackage.RULE__RHS, Rule.class, msgs);
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
			case GrammarPackage.RHS__PARENT_RULE:
				return getParentRule();
			case GrammarPackage.RHS__SUB_GRAPH:
				if (resolve) return getSubGraph();
				return basicGetSubGraph();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GrammarPackage.RHS__PARENT_RULE:
				setParentRule((Rule)newValue);
				return;
			case GrammarPackage.RHS__SUB_GRAPH:
				setSubGraph((Graph)newValue);
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
			case GrammarPackage.RHS__PARENT_RULE:
				setParentRule((Rule)null);
				return;
			case GrammarPackage.RHS__SUB_GRAPH:
				setSubGraph((Graph)null);
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
			case GrammarPackage.RHS__PARENT_RULE:
				return getParentRule() != null;
			case GrammarPackage.RHS__SUB_GRAPH:
				return subGraph != null;
		}
		return super.eIsSet(featureID);
	}
	public String toString() 
	{
		
		StringBuffer buffer= new StringBuffer(); 	// TODO Auto-generated method stub
		//buffer.append(this.subGraph);
		 buffer.append("{"+this.subGraph.getNodes()+" , "+this.subGraph.getEdges()+"}");
		return buffer.toString();
	}

} //RHSImpl
