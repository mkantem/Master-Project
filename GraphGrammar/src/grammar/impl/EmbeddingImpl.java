/**
 */
package grammar.impl;

import grammar.ConnexionInstruction;
import grammar.Embedding;
import grammar.GrammarPackage;
import grammar.Rule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Embedding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link grammar.impl.EmbeddingImpl#getParentRule <em>Parent Rule</em>}</li>
 *   <li>{@link grammar.impl.EmbeddingImpl#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmbeddingImpl extends MinimalEObjectImpl.Container implements Embedding {
	/**
	 * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnexionInstruction> instructions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmbeddingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.EMBEDDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getParentRule() {
		if (eContainerFeatureID() != GrammarPackage.EMBEDDING__PARENT_RULE) return null;
		return (Rule)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentRule(Rule newParentRule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentRule, GrammarPackage.EMBEDDING__PARENT_RULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentRule(Rule newParentRule) {
		if (newParentRule != eInternalContainer() || (eContainerFeatureID() != GrammarPackage.EMBEDDING__PARENT_RULE && newParentRule != null)) {
			if (EcoreUtil.isAncestor(this, newParentRule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentRule != null)
				msgs = ((InternalEObject)newParentRule).eInverseAdd(this, GrammarPackage.RULE__EMBEDDING_MECHANISM, Rule.class, msgs);
			msgs = basicSetParentRule(newParentRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.EMBEDDING__PARENT_RULE, newParentRule, newParentRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnexionInstruction> getInstructions() {
		if (instructions == null) {
			instructions = new EObjectContainmentWithInverseEList<ConnexionInstruction>(ConnexionInstruction.class, this, GrammarPackage.EMBEDDING__INSTRUCTIONS, GrammarPackage.CONNEXION_INSTRUCTION__PARENT_EMBEDDING);
		}
		return instructions;
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
			case GrammarPackage.EMBEDDING__PARENT_RULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentRule((Rule)otherEnd, msgs);
			case GrammarPackage.EMBEDDING__INSTRUCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstructions()).basicAdd(otherEnd, msgs);
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
			case GrammarPackage.EMBEDDING__PARENT_RULE:
				return basicSetParentRule(null, msgs);
			case GrammarPackage.EMBEDDING__INSTRUCTIONS:
				return ((InternalEList<?>)getInstructions()).basicRemove(otherEnd, msgs);
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
			case GrammarPackage.EMBEDDING__PARENT_RULE:
				return eInternalContainer().eInverseRemove(this, GrammarPackage.RULE__EMBEDDING_MECHANISM, Rule.class, msgs);
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
			case GrammarPackage.EMBEDDING__PARENT_RULE:
				return getParentRule();
			case GrammarPackage.EMBEDDING__INSTRUCTIONS:
				return getInstructions();
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
			case GrammarPackage.EMBEDDING__PARENT_RULE:
				setParentRule((Rule)newValue);
				return;
			case GrammarPackage.EMBEDDING__INSTRUCTIONS:
				getInstructions().clear();
				getInstructions().addAll((Collection<? extends ConnexionInstruction>)newValue);
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
			case GrammarPackage.EMBEDDING__PARENT_RULE:
				setParentRule((Rule)null);
				return;
			case GrammarPackage.EMBEDDING__INSTRUCTIONS:
				getInstructions().clear();
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
			case GrammarPackage.EMBEDDING__PARENT_RULE:
				return getParentRule() != null;
			case GrammarPackage.EMBEDDING__INSTRUCTIONS:
				return instructions != null && !instructions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EmbeddingImpl
