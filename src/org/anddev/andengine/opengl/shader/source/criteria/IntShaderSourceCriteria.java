package org.anddev.andengine.opengl.shader.source.criteria;

import org.anddev.andengine.util.operator.IntOperator;

/**
 * (c) Zynga 2011
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 16:59:32 - 10.10.2011
 */
public abstract class IntShaderSourceCriteria implements IShaderSourceCriteria {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	private final int mCriteria;
	private final IntOperator mIntOperator;

	// ===========================================================
	// Constructors
	// ===========================================================

	public IntShaderSourceCriteria(final IntOperator pIntOperator, final int pCriteria) {
		this.mCriteria = pCriteria;
		this.mIntOperator = pIntOperator;
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	protected abstract int getActualCriteria();

	@Override
	public boolean isMet() {
		return this.mIntOperator.check(this.getActualCriteria(), this.mCriteria);
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
