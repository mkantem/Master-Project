/**
 */
package grammar.impl;

import grammar.Embedding;
import grammar.Grammar;
import grammar.GrammarPackage;
import grammar.LHS;
import grammar.RHS;
import grammar.Rule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link grammar.impl.RuleImpl#getParentGrammar <em>Parent Grammar</em>}</li>
 *   <li>{@link grammar.impl.RuleImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link grammar.impl.RuleImpl#getRhs <em>Rhs</em>}</li>
 *   <li>{@link grammar.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link grammar.impl.RuleImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link grammar.impl.RuleImpl#getEmbeddingMechanism <em>Embedding Mechanism</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule {
	/**
	 * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhs()
	 * @generated
	 * @ordered
	 */
	protected LHS lhs;
	private int marker = 0; //pour marquer une règle
	public  void unMarkRule(){marker=1;}
	public  void zeroMarkRule(){marker=0;}
	public  int Mark(){return marker;}
	/**
	 * The cached value of the '{@link #getRhs() <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhs()
	 * @generated
	 * @ordered
	 */
	protected RHS rhs;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmbeddingMechanism() <em>Embedding Mechanism</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddingMechanism()
	 * @generated
	 * @ordered
	 */
	protected Embedding embeddingMechanism;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grammar getParentGrammar() {
		if (eContainerFeatureID() != GrammarPackage.RULE__PARENT_GRAMMAR) return null;
		return (Grammar)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentGrammar(Grammar newParentGrammar, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentGrammar, GrammarPackage.RULE__PARENT_GRAMMAR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentGrammar(Grammar newParentGrammar) {
		if (newParentGrammar != eInternalContainer() || (eContainerFeatureID() != GrammarPackage.RULE__PARENT_GRAMMAR && newParentGrammar != null)) {
			if (EcoreUtil.isAncestor(this, newParentGrammar))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentGrammar != null)
				msgs = ((InternalEObject)newParentGrammar).eInverseAdd(this, GrammarPackage.GRAMMAR__RULES, Grammar.class, msgs);
			msgs = basicSetParentGrammar(newParentGrammar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.RULE__PARENT_GRAMMAR, newParentGrammar, newParentGrammar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LHS getLhs() {
		return lhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLhs(LHS newLhs, NotificationChain msgs) {
		LHS oldLhs = lhs;
		lhs = newLhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrammarPackage.RULE__LHS, oldLhs, newLhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLhs(LHS newLhs) {
		if (newLhs != lhs) {
			NotificationChain msgs = null;
			if (lhs != null)
				msgs = ((InternalEObject)lhs).eInverseRemove(this, GrammarPackage.LHS__PARENT_RULE, LHS.class, msgs);
			if (newLhs != null)
				msgs = ((InternalEObject)newLhs).eInverseAdd(this, GrammarPackage.LHS__PARENT_RULE, LHS.class, msgs);
			msgs = basicSetLhs(newLhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.RULE__LHS, newLhs, newLhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RHS getRhs() {
		return rhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRhs(RHS newRhs, NotificationChain msgs) {
		RHS oldRhs = rhs;
		rhs = newRhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrammarPackage.RULE__RHS, oldRhs, newRhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhs(RHS newRhs) {
		if (newRhs != rhs) {
			NotificationChain msgs = null;
			if (rhs != null)
				msgs = ((InternalEObject)rhs).eInverseRemove(this, GrammarPackage.RHS__PARENT_RULE, RHS.class, msgs);
			if (newRhs != null)
				msgs = ((InternalEObject)newRhs).eInverseAdd(this, GrammarPackage.RHS__PARENT_RULE, RHS.class, msgs);
			msgs = basicSetRhs(newRhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.RULE__RHS, newRhs, newRhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.RULE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Embedding getEmbeddingMechanism() {
		return embeddingMechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmbeddingMechanism(Embedding newEmbeddingMechanism, NotificationChain msgs) {
		Embedding oldEmbeddingMechanism = embeddingMechanism;
		embeddingMechanism = newEmbeddingMechanism;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrammarPackage.RULE__EMBEDDING_MECHANISM, oldEmbeddingMechanism, newEmbeddingMechanism);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbeddingMechanism(Embedding newEmbeddingMechanism) {
		if (newEmbeddingMechanism != embeddingMechanism) {
			NotificationChain msgs = null;
			if (embeddingMechanism != null)
				msgs = ((InternalEObject)embeddingMechanism).eInverseRemove(this, GrammarPackage.EMBEDDING__PARENT_RULE, Embedding.class, msgs);
			if (newEmbeddingMechanism != null)
				msgs = ((InternalEObject)newEmbeddingMechanism).eInverseAdd(this, GrammarPackage.EMBEDDING__PARENT_RULE, Embedding.class, msgs);
			msgs = basicSetEmbeddingMechanism(newEmbeddingMechanism, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.RULE__EMBEDDING_MECHANISM, newEmbeddingMechanism, newEmbeddingMechanism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrammarPackage.RULE__PARENT_GRAMMAR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentGrammar((Grammar)otherEnd, msgs);
			case GrammarPackage.RULE__LHS:
				if (lhs != null)
					msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GrammarPackage.RULE__LHS, null, msgs);
				return basicSetLhs((LHS)otherEnd, msgs);
			case GrammarPackage.RULE__RHS:
				if (rhs != null)
					msgs = ((InternalEObject)rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GrammarPackage.RULE__RHS, null, msgs);
				return basicSetRhs((RHS)otherEnd, msgs);
			case GrammarPackage.RULE__EMBEDDING_MECHANISM:
				if (embeddingMechanism != null)
					msgs = ((InternalEObject)embeddingMechanism).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GrammarPackage.RULE__EMBEDDING_MECHANISM, null, msgs);
				return basicSetEmbeddingMechanism((Embedding)otherEnd, msgs);
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
			case GrammarPackage.RULE__PARENT_GRAMMAR:
				return basicSetParentGrammar(null, msgs);
			case GrammarPackage.RULE__LHS:
				return basicSetLhs(null, msgs);
			case GrammarPackage.RULE__RHS:
				return basicSetRhs(null, msgs);
			case GrammarPackage.RULE__EMBEDDING_MECHANISM:
				return basicSetEmbeddingMechanism(null, msgs);
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
			case GrammarPackage.RULE__PARENT_GRAMMAR:
				return eInternalContainer().eInverseRemove(this, GrammarPackage.GRAMMAR__RULES, Grammar.class, msgs);
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
			case GrammarPackage.RULE__PARENT_GRAMMAR:
				return getParentGrammar();
			case GrammarPackage.RULE__LHS:
				return getLhs();
			case GrammarPackage.RULE__RHS:
				return getRhs();
			case GrammarPackage.RULE__NAME:
				return getName();
			case GrammarPackage.RULE__PRIORITY:
				return getPriority();
			case GrammarPackage.RULE__EMBEDDING_MECHANISM:
				return getEmbeddingMechanism();
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
			case GrammarPackage.RULE__PARENT_GRAMMAR:
				setParentGrammar((Grammar)newValue);
				return;
			case GrammarPackage.RULE__LHS:
				setLhs((LHS)newValue);
				return;
			case GrammarPackage.RULE__RHS:
				setRhs((RHS)newValue);
				return;
			case GrammarPackage.RULE__NAME:
				setName((String)newValue);
				return;
			case GrammarPackage.RULE__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case GrammarPackage.RULE__EMBEDDING_MECHANISM:
				setEmbeddingMechanism((Embedding)newValue);
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
			case GrammarPackage.RULE__PARENT_GRAMMAR:
				setParentGrammar((Grammar)null);
				return;
			case GrammarPackage.RULE__LHS:
				setLhs((LHS)null);
				return;
			case GrammarPackage.RULE__RHS:
				setRhs((RHS)null);
				return;
			case GrammarPackage.RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GrammarPackage.RULE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case GrammarPackage.RULE__EMBEDDING_MECHANISM:
				setEmbeddingMechanism((Embedding)null);
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
			case GrammarPackage.RULE__PARENT_GRAMMAR:
				return getParentGrammar() != null;
			case GrammarPackage.RULE__LHS:
				return lhs != null;
			case GrammarPackage.RULE__RHS:
				return rhs != null;
			case GrammarPackage.RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GrammarPackage.RULE__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case GrammarPackage.RULE__EMBEDDING_MECHANISM:
				return embeddingMechanism != null;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer();//super.toString()
		result.append(" (name: ");
		result.append(name);
		result.append(", priority: ");
		result.append(priority+"\n");
		result.append("\t"+this.getLhs().getNode().toString()+"---->"+this.getRhs().getSubGraph().toString());
		result.append(')');
		return result.toString();
	}

} //RuleImpl
