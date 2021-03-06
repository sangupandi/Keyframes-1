/**
 * Copyright (c) 2016-present, Facebook, Inc.
 * All rights reserved.
 * <p>
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.facebook.keyframes.model;

/**
 * An interface to identify an object which has a key frame associated with it.
 */
public interface HasKeyFrame {
    int getKeyFrame();
}
