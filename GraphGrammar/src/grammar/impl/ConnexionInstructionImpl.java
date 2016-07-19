/**
 */
package grammar.impl;

import grammar.ConnexionInstruction;
import grammar.Embedding;
import grammar.GrammarPackage;

import graph.Node;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connexion Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link grammar.impl.ConnexionInstructionImpl#getParentEmbedding <em>Parent Embedding</em>}</li>
 *   <li>{@link grammar.impl.ConnexionInstructionImpl#getM <em>M</em>}</li>
 *   <li>{@link grammar.impl.ConnexionInstructionImpl#getD <em>D</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnexionInstructionImpl extends MinimalEObjectImpl.Container implements ConnexionInstruction {
	/**
	 * The default value of the '{@link #getM() <em>M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM()
	 * @generated
	 * @ordered
	 */
	protected static final String M_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM() <em>M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM()
	 * @generated
	 * @ordered
	 */
	protected String m = M_EDEFAULT;

	/**
	 * The cached value of the '{@link #getD() <em>D</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected Node d;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnexionInstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.CONNEXION_INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Embedding getParentEmbedding() {
		if (eContainerFeatureID() != GrammarPackage.CONNEXION_INSTRUCTION__PARENT_EMBEDDING) return null;
		return (Embedding)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentEmbedding(Embedding newParentEmbedding, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentEmbedding, GrammarPackage.CONNEXION_INSTRUCTION__PARENT_EMBEDDING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentEmbedding(Embedding newParentEmbedding) {
		if (newParentEmbedding != eInternalContainer() || (eContainerFeatureID() != GrammarPackage.CONNEXION_INSTRUCTION__PARENT_EMBEDDING && newParentEmbedding != null)) {
			if (EcoreUtil.isAncestor(this, newParentEmbedding))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentEmbedding != null)
				msgs = ((InternalEObject)newParentEmbedding).eInverseAdd(this, GrammarPackage.EMBEDDING__INSTRUCTIONS, Embedding.class, msgs);
			msgs = basicSetParentEmbedding(newParentEmbedding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.CONNEXION_INSTRUCTION__PARENT_EMBEDDING, newParentEmbedding, newParentEmbedding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getM() {
		return m;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM(String newM) {
		String oldM = m;
		m = newM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.CONNEXION_INSTRUCTION__M, oldM, m));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getD() {
		if (d != null && d.eIsProxy()) {
			InternalEObject oldD = (InternalEObject)d;
			d = (Node)eResolveProxy(oldD);
			if (d != oldD) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.CONNEXION_INSTRUCTION__D, oldD, d));
			}
		}
		return d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetD() {
		return d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setD(Node newD) {
		Node oldD = d;
		d = newD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.CONNEXION_INSTRUCTION__D, oldD, d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrammarPackage.CONNEXION_INSTRUCTION__PARENT_EMBEDDING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentEmbedding((Embedding)otherEnd, msgs);
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
			case GrammarPackage.CONNEXION_INSTRUCTION__PARENT_EMBEDDING:
				return basicSetParentEmbedding(null, msgs);
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
			case GrammarPackage.CONNEXION_INSTRUCTION__PARENT_EMBEDDING:
				return eInternalContainer().eInverseRemove(this, GrammarPackage.EMBEDDING__INSTRUCTIONS, Embedding.class, msgs);
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
			case GrammarPackage.CONNEXION_INSTRUCTION__PARENT_EMBEDDING:
				return getParentEmbedding();
			case GrammarPackage.CONNEXION_INSTRUCTION__M:
				return getM();
			case GrammarPackage.CONNEXION_INSTRUCTION__D:
				if (resolve) return getD();
				return basicGetD();
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
			case GrammarPackage.CONNEXION_INSTRUCTION__PARENT_EMBEDDING:
				setParentEmbedding((Embedding)newValue);
				return;
			case GrammarPackage.CONNEXION_INSTRUCTION__M:
				setM((String)newValue);
				return;
			case GrammarPackage.CONNEXION_INSTRUCTION__D:
				setD((Node)newValue);
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
			case GrammarPackage.CONNEXION_INSTRUCTION__PARENT_EMBEDDING:
				setParentEmbedding((Embedding)null);
				return;
			case GrammarPackage.CONNEXION_INSTRUCTION__M:
				setM(M_EDEFAULT);
				return;
			case GrammarPackage.CONNEXION_INSTRUCTION__D:
				setD((Node)null);
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
			case GrammarPackage.CONNEXION_INSTRUCTION__PARENT_EMBEDDING:
				return getParentEmbedding() != null;
			case GrammarPackage.CONNEXION_INSTRUCTION__M:
				return M_EDEFAULT == null ? m != null : !M_EDEFAULT.equals(m);
			case GrammarPackage.CONNEXION_INSTRUCTION__D:
				return d != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (m: ");
		result.append(m);
		result.append(')');
		return result.toString();
	}

} //ConnexionInstructionImpl
