package org.fest.assertions.api.android.app;

import android.app.DialogFragment;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link DialogFragment} instances. */
public class DialogFragmentAssert
    extends AbstractFragmentAssert<DialogFragmentAssert, DialogFragment> {
  public DialogFragmentAssert(DialogFragment actual) {
    super(actual, DialogFragmentAssert.class);
  }

  public DialogFragmentAssert isCancelable() {
    isNotNull();
    assertThat(actual.isCancelable()) //
        .overridingErrorMessage("Expected to be cancelable but was not cancelable.") //
        .isTrue();
    return this;
  }

  public DialogFragmentAssert isNotCancelable() {
    isNotNull();
    assertThat(actual.isCancelable()) //
        .overridingErrorMessage("Expected to be not cancelable but was cancelable.") //
        .isFalse();
    return this;
  }
}
