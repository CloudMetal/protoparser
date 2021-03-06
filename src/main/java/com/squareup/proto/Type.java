// Copyright 2013 Square, Inc.
package com.squareup.proto;

import java.util.List;

/** A message type or enum type declaration. */
public interface Type {
  String getName();

  List<Type> getNestedTypes();
}
