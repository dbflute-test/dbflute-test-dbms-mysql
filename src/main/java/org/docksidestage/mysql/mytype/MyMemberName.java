/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.docksidestage.mysql.mytype;

/**
 * @author jflute
 * @since 1.0.5D (2014/03/21 Friday)
 */
public class MyMemberName implements CharSequence {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected String _value;

    // ===================================================================================
    //                                                                               Setup
    //                                                                               =====
    public MyMemberName setup(String value) {
        _value = value;
        return this;
    }

    // ===================================================================================
    //                                                                        CharSequence
    //                                                                        ============
    public int length() {
        assertValueStatus();
        return _value.length();
    }

    public char charAt(int i) {
        assertValueStatus();
        return _value.charAt(i);
    }

    public CharSequence subSequence(int i, int j) {
        assertValueStatus();
        return _value.subSequence(i, j);
    }

    protected void assertValueStatus() {
        if (_value == null) {
            throw new IllegalStateException("null value");
        }
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ===== ========
    @Override
    public String toString() {
        return _value;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public String getValue() {
        return _value;
    }

    public void setValue(String value) {
        this._value = value;
    }
}
