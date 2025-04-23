
-- =======================================================================================
--                                                                                   Basic
--                                                                                   =====
-- #df:begin#
create function FN_NO_PARAMETER() returns integer deterministic
begin
  return 1;
end;
-- #df:end#

-- #df:begin#
create function FN_IN_OUT_PARAMETER(
      v_in_varchar varchar(32)
    , v_out_varchar varchar(32)
    , v_inout_varchar varchar(32)
) returns varchar(32) deterministic
begin
  set v_out_varchar = v_inout_varchar;
  set v_inout_varchar = v_in_varchar;
  return v_in_varchar;
end;
-- #df:end#


-- =======================================================================================
--                                                                        Return ResultSet
--                                                                        ================


-- =======================================================================================
--                                                                             Transaction
--                                                                             ===========


-- =======================================================================================
--                                                                             TypeMapping
--                                                                             ===========
