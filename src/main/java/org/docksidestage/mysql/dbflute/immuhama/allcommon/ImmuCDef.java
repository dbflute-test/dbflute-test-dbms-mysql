/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
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
package org.docksidestage.mysql.dbflute.immuhama.allcommon;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

import org.dbflute.exception.ClassificationNotFoundException;
import org.dbflute.jdbc.Classification;
import org.dbflute.jdbc.ClassificationCodeType;
import org.dbflute.jdbc.ClassificationMeta;
import org.dbflute.jdbc.ClassificationUndefinedHandlingType;
import org.dbflute.optional.OptionalThing;

/**
 * The definition of classification.
 * @author DBFlute(AutoGenerator)
 */
public interface ImmuCDef extends Classification {

    /**
     * general boolean classification for every flg-column
     */
    public enum Flg implements ImmuCDef {
        /** Yes: means valid */
        True("1", "Yes"),
        /** No: means invalid */
        False("0", "No");
        private static ZzzoneSlimmer<Flg> _slimmer = new ZzzoneSlimmer<>(Flg.class, values());
        private String _code; private String _alias;
        private Flg(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return ImmuCDef.DefMeta.Flg; }
        public boolean inGroup(String groupName) { return false; }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<Flg> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<Flg> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static Flg codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span>
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         * @deprecated use byName(name) instead.
         */
        public static Flg nameOf(String name) { return _slimmer.nameOf(name, nm -> valueOf(nm)); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<Flg> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<Flg> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: Flg." + groupName);
        }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use e.g. Stream API with of().</span>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         * @deprecated use e.g. Stream API with of() instead.
         */
        public static List<Flg> listOf(Collection<String> codeList) { return _slimmer.listOf(codeList); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use listByGroup(groupName).</span>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         * @deprecated use listByGroup(groupName) instead.
         */
        public static List<Flg> groupOf(String groupName) { return new ArrayList<>(); }
        @Override public String toString() { return code(); }
    }

    /**
     * status of member from entry to withdrawal
     */
    public enum MemberStatus implements ImmuCDef {
        ;
        private static ZzzoneSlimmer<MemberStatus> _slimmer = new ZzzoneSlimmer<>(MemberStatus.class, values());
        private String _code; private String _alias;
        private MemberStatus(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return ImmuCDef.DefMeta.MemberStatus; }
        public boolean inGroup(String groupName) { return false; }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<MemberStatus> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<MemberStatus> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static MemberStatus codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span>
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         * @deprecated use byName(name) instead.
         */
        public static MemberStatus nameOf(String name) { return _slimmer.nameOf(name, nm -> valueOf(nm)); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<MemberStatus> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<MemberStatus> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: MemberStatus." + groupName);
        }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use e.g. Stream API with of().</span>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         * @deprecated use e.g. Stream API with of() instead.
         */
        public static List<MemberStatus> listOf(Collection<String> codeList) { return _slimmer.listOf(codeList); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use listByGroup(groupName).</span>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         * @deprecated use listByGroup(groupName) instead.
         */
        public static List<MemberStatus> groupOf(String groupName) { return new ArrayList<>(); }
        @Override public String toString() { return code(); }
    }

    /**
     * mainly region of member address
     */
    public enum Region implements ImmuCDef {
        ;
        private static ZzzoneSlimmer<Region> _slimmer = new ZzzoneSlimmer<>(Region.class, values());
        private String _code; private String _alias;
        private Region(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return ImmuCDef.DefMeta.Region; }
        public boolean inGroup(String groupName) { return false; }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<Region> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<Region> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static Region codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span>
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         * @deprecated use byName(name) instead.
         */
        public static Region nameOf(String name) { return _slimmer.nameOf(name, nm -> valueOf(nm)); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<Region> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<Region> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: Region." + groupName);
        }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use e.g. Stream API with of().</span>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         * @deprecated use e.g. Stream API with of() instead.
         */
        public static List<Region> listOf(Collection<String> codeList) { return _slimmer.listOf(codeList); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use listByGroup(groupName).</span>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         * @deprecated use listByGroup(groupName) instead.
         */
        public static List<Region> groupOf(String groupName) { return new ArrayList<>(); }
        @Override public String toString() { return code(); }
    }

    /**
     * reason for member withdrawal
     */
    public enum WithdrawalReason implements ImmuCDef {
        ;
        private static ZzzoneSlimmer<WithdrawalReason> _slimmer = new ZzzoneSlimmer<>(WithdrawalReason.class, values());
        private String _code; private String _alias;
        private WithdrawalReason(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return ImmuCDef.DefMeta.WithdrawalReason; }
        public boolean inGroup(String groupName) { return false; }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<WithdrawalReason> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<WithdrawalReason> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static WithdrawalReason codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span>
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         * @deprecated use byName(name) instead.
         */
        public static WithdrawalReason nameOf(String name) { return _slimmer.nameOf(name, nm -> valueOf(nm)); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<WithdrawalReason> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<WithdrawalReason> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: WithdrawalReason." + groupName);
        }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use e.g. Stream API with of().</span>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         * @deprecated use e.g. Stream API with of() instead.
         */
        public static List<WithdrawalReason> listOf(Collection<String> codeList) { return _slimmer.listOf(codeList); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use listByGroup(groupName).</span>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         * @deprecated use listByGroup(groupName) instead.
         */
        public static List<WithdrawalReason> groupOf(String groupName) { return new ArrayList<>(); }
        @Override public String toString() { return code(); }
    }

    /**
     * 支払方法
     */
    public enum PaymentMethod implements ImmuCDef {
        /** 手渡し: Face-to-Faceの手渡しで商品と交換 */
        ByHand("HAN", "手渡し"),
        /** 銀行振込: 銀行振込で確認してから商品発送 */
        BankTransfer("BAK", "銀行振込"),
        /** クレジットカード: クレジットカードの番号を教えてもらう */
        CreditCard("CRC", "クレジットカード");
        private static ZzzoneSlimmer<PaymentMethod> _slimmer = new ZzzoneSlimmer<>(PaymentMethod.class, values());
        private String _code; private String _alias;
        private PaymentMethod(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return ImmuCDef.DefMeta.PaymentMethod; }
        /**
         * Is the classification in the group? <br>
         * 最も推奨されている方法 <br>
         * The group elements:[ByHand]
         * @return The determination, true or false.
         */
        public boolean isRecommended() { return ByHand.equals(this); }
        public boolean inGroup(String groupName) {
            if ("recommended".equalsIgnoreCase(groupName)) { return isRecommended(); }
            return false;
        }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<PaymentMethod> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<PaymentMethod> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static PaymentMethod codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span>
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         * @deprecated use byName(name) instead.
         */
        public static PaymentMethod nameOf(String name) { return _slimmer.nameOf(name, nm -> valueOf(nm)); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<PaymentMethod> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<PaymentMethod> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("recommended".equalsIgnoreCase(groupName)) { return listOfRecommended(); }
            throw new ClassificationNotFoundException("Unknown classification group: PaymentMethod." + groupName);
        }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use e.g. Stream API with of().</span>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         * @deprecated use e.g. Stream API with of() instead.
         */
        public static List<PaymentMethod> listOf(Collection<String> codeList) { return _slimmer.listOf(codeList); }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * 最も推奨されている方法 <br>
         * The group elements:[ByHand]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<PaymentMethod> listOfRecommended() {
            return new ArrayList<>(Arrays.asList(ByHand));
        }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use listByGroup(groupName).</span>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         * @deprecated use listByGroup(groupName) instead.
         */
        public static List<PaymentMethod> groupOf(String groupName) {
            if ("recommended".equalsIgnoreCase(groupName)) { return listOfRecommended(); }
            return new ArrayList<>();
        }
        @Override public String toString() { return code(); }
    }

    public enum DefMeta implements ClassificationMeta {
        /** general boolean classification for every flg-column */
        Flg(cd -> ImmuCDef.Flg.of(cd), nm -> ImmuCDef.Flg.byName(nm)
        , () -> ImmuCDef.Flg.listAll(), gp -> ImmuCDef.Flg.listByGroup(gp)
        , ClassificationCodeType.Number, ClassificationUndefinedHandlingType.EXCEPTION),

        /** status of member from entry to withdrawal */
        MemberStatus(cd -> ImmuCDef.MemberStatus.of(cd), nm -> ImmuCDef.MemberStatus.byName(nm)
        , () -> ImmuCDef.MemberStatus.listAll(), gp -> ImmuCDef.MemberStatus.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** mainly region of member address */
        Region(cd -> ImmuCDef.Region.of(cd), nm -> ImmuCDef.Region.byName(nm)
        , () -> ImmuCDef.Region.listAll(), gp -> ImmuCDef.Region.listByGroup(gp)
        , ClassificationCodeType.Number, ClassificationUndefinedHandlingType.LOGGING),

        /** reason for member withdrawal */
        WithdrawalReason(cd -> ImmuCDef.WithdrawalReason.of(cd), nm -> ImmuCDef.WithdrawalReason.byName(nm)
        , () -> ImmuCDef.WithdrawalReason.listAll(), gp -> ImmuCDef.WithdrawalReason.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** 支払方法 */
        PaymentMethod(cd -> ImmuCDef.PaymentMethod.of(cd), nm -> ImmuCDef.PaymentMethod.byName(nm)
        , () -> ImmuCDef.PaymentMethod.listAll(), gp -> ImmuCDef.PaymentMethod.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.EXCEPTION);

        private static final Map<String, DefMeta> _nameMetaMap = new HashMap<>();
        static {
            for (DefMeta value : values()) {
                _nameMetaMap.put(value.name().toLowerCase(), value);
            }
        }
        private final Function<Object, OptionalThing<? extends Classification>> _ofCall;
        private final Function<String, OptionalThing<? extends Classification>> _byNameCall;
        private final Supplier<List<? extends Classification>> _listAllCall;
        private final Function<String, List<? extends Classification>> _listByGroupCall;
        private final ClassificationCodeType _codeType;
        private final ClassificationUndefinedHandlingType _undefinedHandlingType;
        private DefMeta(Function<Object, OptionalThing<? extends Classification>> ofCall
                      , Function<String, OptionalThing<? extends Classification>> byNameCall
                      , Supplier<List<? extends Classification>> listAllCall
                      , Function<String, List<? extends Classification>> listByGroupCall
                      , ClassificationCodeType codeType
                      , ClassificationUndefinedHandlingType undefinedHandlingType
                ) {
            _ofCall = ofCall;
            _byNameCall = byNameCall;
            _listAllCall = listAllCall;
            _listByGroupCall = listByGroupCall;
            _codeType = codeType;
            _undefinedHandlingType = undefinedHandlingType;
        }
        public String classificationName() { return name(); } // same as definition name

        public OptionalThing<? extends Classification> of(Object code) { return _ofCall.apply(code); }
        public OptionalThing<? extends Classification> byName(String name) { return _byNameCall.apply(name); }

        public Classification codeOf(Object code) // null allowed, old style
        { return of(code).orElse(null); }
        public Classification nameOf(String name) { // null allowed, old style
            if (name == null) { return null; } // for compatible
            return byName(name).orElse(null); // case insensitive
        }

        public List<Classification> listAll()
        { return toClsList(_listAllCall.get()); }
        public List<Classification> listByGroup(String groupName) // exception if not found
        { return toClsList(_listByGroupCall.apply(groupName)); }

        @SuppressWarnings("unchecked")
        private List<Classification> toClsList(List<?> clsList) { return (List<Classification>)clsList; }

        public List<Classification> listOf(Collection<String> codeList) { // copied from slimmer, old style
            if (codeList == null) {
                throw new IllegalArgumentException("The argument 'codeList' should not be null.");
            }
            List<Classification> clsList = new ArrayList<>(codeList.size());
            for (String code : codeList) {
                clsList.add(of(code).get());
            }
            return clsList;
        }
        public List<Classification> groupOf(String groupName) { // empty if not found, old style
            try {
                return listByGroup(groupName); // case insensitive
            } catch (IllegalArgumentException | ClassificationNotFoundException e) {
                return new ArrayList<>(); // null or not found
            }
        }

        public ClassificationCodeType codeType() { return _codeType; }
        public ClassificationUndefinedHandlingType undefinedHandlingType() { return _undefinedHandlingType; }

        public static OptionalThing<ImmuCDef.DefMeta> find(String classificationName) { // instead of valueOf()
            if (classificationName == null) { throw new IllegalArgumentException("The argument 'classificationName' should not be null."); }
            return OptionalThing.ofNullable(_nameMetaMap.get(classificationName.toLowerCase()), () -> {
                throw new ClassificationNotFoundException("Unknown classification: " + classificationName);
            });
        }
        public static ImmuCDef.DefMeta meta(String classificationName) { // old style so use find(name)
            return find(classificationName).orElse(null);
        }
    }

    public static class ZzzoneSlimmer<CLS extends ImmuCDef> {

        public static Set<String> toSisterSet(String[] sisters) { // used by initializer so static
            return Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters)));
        }

        private final Class<CLS> _clsType;
        private final Map<String, CLS> _codeClsMap = new HashMap<>();
        private final Map<String, CLS> _nameClsMap = new HashMap<>();

        public ZzzoneSlimmer(Class<CLS> clsType, CLS[] values) {
            _clsType = clsType;
            initMap(values);
        }

        private void initMap(CLS[] values) {
            for (CLS value : values) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) {
                    _codeClsMap.put(sister.toLowerCase(), value);
                }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }

        public OptionalThing<CLS> of(Object code) {
            if (code == null) {
                return OptionalThing.ofNullable(null, () -> {
                    throw new ClassificationNotFoundException("null code specified");
                });
            }
            if (_clsType.isAssignableFrom(code.getClass())) {
                @SuppressWarnings("unchecked")
                CLS cls = (CLS) code;
                return OptionalThing.of(cls);
            }
            if (code instanceof OptionalThing<?>) {
                return of(((OptionalThing<?>) code).orElse(null));
            }
            return OptionalThing.ofNullable(_codeClsMap.get(code.toString().toLowerCase()), () -> {
                throw new ClassificationNotFoundException("Unknown classification code: " + code);
            });
        }

        public OptionalThing<CLS> byName(String name) {
            if (name == null) {
                throw new IllegalArgumentException("The argument 'name' should not be null.");
            }
            return OptionalThing.ofNullable(_nameClsMap.get(name.toLowerCase()), () -> {
                throw new ClassificationNotFoundException("Unknown classification name: " + name);
            });
        }

        public CLS codeOf(Object code) {
            if (code == null) {
                return null;
            }
            if (_clsType.isAssignableFrom(code.getClass())) {
                @SuppressWarnings("unchecked")
                CLS cls = (CLS) code;
                return cls;
            }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        public CLS nameOf(String name, java.util.function.Function<String, CLS> valueOfCall) {
            if (name == null) {
                return null;
            }
            try {
                return valueOfCall.apply(name);
            } catch (RuntimeException ignored) { // not found
                return null;
            }
        }

        public List<CLS> listAll(CLS[] clss) {
            return new ArrayList<>(Arrays.asList(clss));
        }

        public List<CLS> listOf(Collection<String> codeList) {
            if (codeList == null) {
                throw new IllegalArgumentException("The argument 'codeList' should not be null.");
            }
            List<CLS> clsList = new ArrayList<>(codeList.size());
            for (String code : codeList) {
                clsList.add(of(code).get());
            }
            return clsList;
        }
    }
}
