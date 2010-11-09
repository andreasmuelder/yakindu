/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipselabs.mscript.language.ast.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.mscript.language.ast.AstPackage;
import org.eclipselabs.mscript.language.ast.Expression;
import org.eclipselabs.mscript.language.ast.IterationAccumulator;
import org.eclipselabs.mscript.language.ast.IterationCall;
import org.eclipselabs.mscript.language.ast.IterationVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iteration Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.mscript.language.ast.impl.IterationCallImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.eclipselabs.mscript.language.ast.impl.IterationCallImpl#getAccumulator <em>Accumulator</em>}</li>
 *   <li>{@link org.eclipselabs.mscript.language.ast.impl.IterationCallImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IterationCallImpl extends FeatureCallPartImpl implements IterationCall
{
  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<IterationVariable> variables;

  /**
   * The cached value of the '{@link #getAccumulator() <em>Accumulator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccumulator()
   * @generated
   * @ordered
   */
  protected IterationAccumulator accumulator;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IterationCallImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AstPackage.Literals.ITERATION_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IterationVariable> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<IterationVariable>(IterationVariable.class, this, AstPackage.ITERATION_CALL__VARIABLES);
    }
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IterationAccumulator getAccumulator()
  {
    return accumulator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAccumulator(IterationAccumulator newAccumulator, NotificationChain msgs)
  {
    IterationAccumulator oldAccumulator = accumulator;
    accumulator = newAccumulator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstPackage.ITERATION_CALL__ACCUMULATOR, oldAccumulator, newAccumulator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccumulator(IterationAccumulator newAccumulator)
  {
    if (newAccumulator != accumulator)
    {
      NotificationChain msgs = null;
      if (accumulator != null)
        msgs = ((InternalEObject)accumulator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstPackage.ITERATION_CALL__ACCUMULATOR, null, msgs);
      if (newAccumulator != null)
        msgs = ((InternalEObject)newAccumulator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstPackage.ITERATION_CALL__ACCUMULATOR, null, msgs);
      msgs = basicSetAccumulator(newAccumulator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.ITERATION_CALL__ACCUMULATOR, newAccumulator, newAccumulator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstPackage.ITERATION_CALL__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstPackage.ITERATION_CALL__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstPackage.ITERATION_CALL__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.ITERATION_CALL__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AstPackage.ITERATION_CALL__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
      case AstPackage.ITERATION_CALL__ACCUMULATOR:
        return basicSetAccumulator(null, msgs);
      case AstPackage.ITERATION_CALL__EXPRESSION:
        return basicSetExpression(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AstPackage.ITERATION_CALL__VARIABLES:
        return getVariables();
      case AstPackage.ITERATION_CALL__ACCUMULATOR:
        return getAccumulator();
      case AstPackage.ITERATION_CALL__EXPRESSION:
        return getExpression();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AstPackage.ITERATION_CALL__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends IterationVariable>)newValue);
        return;
      case AstPackage.ITERATION_CALL__ACCUMULATOR:
        setAccumulator((IterationAccumulator)newValue);
        return;
      case AstPackage.ITERATION_CALL__EXPRESSION:
        setExpression((Expression)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AstPackage.ITERATION_CALL__VARIABLES:
        getVariables().clear();
        return;
      case AstPackage.ITERATION_CALL__ACCUMULATOR:
        setAccumulator((IterationAccumulator)null);
        return;
      case AstPackage.ITERATION_CALL__EXPRESSION:
        setExpression((Expression)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AstPackage.ITERATION_CALL__VARIABLES:
        return variables != null && !variables.isEmpty();
      case AstPackage.ITERATION_CALL__ACCUMULATOR:
        return accumulator != null;
      case AstPackage.ITERATION_CALL__EXPRESSION:
        return expression != null;
    }
    return super.eIsSet(featureID);
  }

} //IterationCallImpl
