/**
 * Copyright (c) 2015-present, Facebook, Inc.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 *
 * Stub of XGModule for Android.
 *
 * @format
 * @flow
 */

'use strict';

const NativeXGModule = require('NativeModules').XGModule;

/**
 * High-level docs for the XGModule iOS API can be written here.
 */

const XGModule = {
  test: function() {
    NativeXGModule.test();
  },
};

module.exports = XGModule;
