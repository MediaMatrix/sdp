/* -----------------------------------------------------------------------------
 * Visitor.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.2
 * Produced : Mon Aug 20 21:04:46 CEST 2012
 *
 * -----------------------------------------------------------------------------
 */

package org.murillo.abnf;

public interface Visitor
{
  public Object visit(Rule$session_description rule);
  public Object visit(Rule$proto_version rule);
  public Object visit(Rule$origin_field rule);
  public Object visit(Rule$session_name_field rule);
  public Object visit(Rule$information_field rule);
  public Object visit(Rule$uri_field rule);
  public Object visit(Rule$email_fields rule);
  public Object visit(Rule$email_field rule);
  public Object visit(Rule$phone_fields rule);
  public Object visit(Rule$phone_field rule);
  public Object visit(Rule$connection_field rule);
  public Object visit(Rule$bandwidth_fields rule);
  public Object visit(Rule$bandwidth_field rule);
  public Object visit(Rule$time_fields rule);
  public Object visit(Rule$time_repeat_field rule);
  public Object visit(Rule$time_field rule);
  public Object visit(Rule$repeat_field rule);
  public Object visit(Rule$zone_adjustments rule);
  public Object visit(Rule$key_field rule);
  public Object visit(Rule$attribute_fields rule);
  public Object visit(Rule$attribute_field rule);
  public Object visit(Rule$gen_attribute rule);
  public Object visit(Rule$mid_attr rule);
  public Object visit(Rule$identification_tag rule);
  public Object visit(Rule$group_attr rule);
  public Object visit(Rule$group_semantics rule);
  public Object visit(Rule$ssrc_attr rule);
  public Object visit(Rule$ssrc_id rule);
  public Object visit(Rule$ssrc_group_attr rule);
  public Object visit(Rule$ssrc_group_semantics rule);
  public Object visit(Rule$cname_attr rule);
  public Object visit(Rule$cname rule);
  public Object visit(Rule$previous_ssrc_attr rule);
  public Object visit(Rule$rtpmap_attr rule);
  public Object visit(Rule$name rule);
  public Object visit(Rule$rate rule);
  public Object visit(Rule$parameters rule);
  public Object visit(Rule$fmtp_attr rule);
  public Object visit(Rule$param_list rule);
  public Object visit(Rule$media_descriptions rule);
  public Object visit(Rule$media_description rule);
  public Object visit(Rule$media_field rule);
  public Object visit(Rule$username rule);
  public Object visit(Rule$sess_id rule);
  public Object visit(Rule$sess_version rule);
  public Object visit(Rule$nettype rule);
  public Object visit(Rule$addrtype rule);
  public Object visit(Rule$email_address rule);
  public Object visit(Rule$address_and_comment rule);
  public Object visit(Rule$dispname_and_address rule);
  public Object visit(Rule$phone_number rule);
  public Object visit(Rule$phone rule);
  public Object visit(Rule$connection_address rule);
  public Object visit(Rule$unicast_address rule);
  public Object visit(Rule$bwtype rule);
  public Object visit(Rule$bandwidth rule);
  public Object visit(Rule$start_time rule);
  public Object visit(Rule$stop_time rule);
  public Object visit(Rule$time rule);
  public Object visit(Rule$repeat_interval rule);
  public Object visit(Rule$typed_time rule);
  public Object visit(Rule$fixed_len_time_unit rule);
  public Object visit(Rule$key_type rule);
  public Object visit(Rule$prompt_key_type rule);
  public Object visit(Rule$clear_key_type rule);
  public Object visit(Rule$base64_key_type rule);
  public Object visit(Rule$uri_key_type rule);
  public Object visit(Rule$base64 rule);
  public Object visit(Rule$base64_unit rule);
  public Object visit(Rule$base64_pad rule);
  public Object visit(Rule$base64_char rule);
  public Object visit(Rule$attribute rule);
  public Object visit(Rule$att_field rule);
  public Object visit(Rule$att_value rule);
  public Object visit(Rule$media rule);
  public Object visit(Rule$fmt rule);
  public Object visit(Rule$proto rule);
  public Object visit(Rule$port rule);
  public Object visit(Rule$IP4_multicast rule);
  public Object visit(Rule$m1 rule);
  public Object visit(Rule$IP6_multicast rule);
  public Object visit(Rule$ttl rule);
  public Object visit(Rule$FQDN rule);
  public Object visit(Rule$IP4_address rule);
  public Object visit(Rule$b1 rule);
  public Object visit(Rule$IP6_address rule);
  public Object visit(Rule$hexpart rule);
  public Object visit(Rule$hexseq rule);
  public Object visit(Rule$email_safe rule);
  public Object visit(Rule$URI rule);
  public Object visit(Rule$hier_part rule);
  public Object visit(Rule$URI_reference rule);
  public Object visit(Rule$absolute_URI rule);
  public Object visit(Rule$relative_ref rule);
  public Object visit(Rule$relative_part rule);
  public Object visit(Rule$scheme rule);
  public Object visit(Rule$authority rule);
  public Object visit(Rule$userinfo rule);
  public Object visit(Rule$host rule);
  public Object visit(Rule$IP_literal rule);
  public Object visit(Rule$IPvFuture rule);
  public Object visit(Rule$IPv6address rule);
  public Object visit(Rule$h16 rule);
  public Object visit(Rule$HEXDIG4 rule);
  public Object visit(Rule$ls32 rule);
  public Object visit(Rule$IPv4address rule);
  public Object visit(Rule$dec_octet rule);
  public Object visit(Rule$reg_name rule);
  public Object visit(Rule$path rule);
  public Object visit(Rule$path_abempty rule);
  public Object visit(Rule$path_absolute rule);
  public Object visit(Rule$path_noscheme rule);
  public Object visit(Rule$path_rootless rule);
  public Object visit(Rule$path_empty rule);
  public Object visit(Rule$segment rule);
  public Object visit(Rule$segment_nz rule);
  public Object visit(Rule$segment_nz_nc rule);
  public Object visit(Rule$pchar rule);
  public Object visit(Rule$query rule);
  public Object visit(Rule$fragment rule);
  public Object visit(Rule$pct_encoded rule);
  public Object visit(Rule$unreserved rule);
  public Object visit(Rule$reserved rule);
  public Object visit(Rule$gen_delims rule);
  public Object visit(Rule$sub_delims rule);
  public Object visit(Rule$addr_spec rule);
  public Object visit(Rule$local_part rule);
  public Object visit(Rule$domain rule);
  public Object visit(Rule$domain_literal rule);
  public Object visit(Rule$dcontent rule);
  public Object visit(Rule$dtext rule);
  public Object visit(Rule$NO_WS_CTL rule);
  public Object visit(Rule$quoted_pair rule);
  public Object visit(Rule$text rule);
  public Object visit(Rule$FWS rule);
  public Object visit(Rule$comment rule);
  public Object visit(Rule$ccontent rule);
  public Object visit(Rule$ctext rule);
  public Object visit(Rule$dot_atom rule);
  public Object visit(Rule$dot_atom_text rule);
  public Object visit(Rule$atext rule);
  public Object visit(Rule$integer rule);
  public Object visit(Rule$alpha_numeric rule);
  public Object visit(Rule$decimal_uchar rule);
  public Object visit(Rule$decimal_uchar_1xx rule);
  public Object visit(Rule$decimal_uchar_2xx rule);
  public Object visit(Rule$decimal_uchar_25x rule);
  public Object visit(Rule$BIT rule);
  public Object visit(Rule$CHAR rule);
  public Object visit(Rule$CR rule);
  public Object visit(Rule$CTL rule);
  public Object visit(Rule$HEXDIG rule);
  public Object visit(Rule$HTAB rule);
  public Object visit(Rule$LF rule);
  public Object visit(Rule$LWSP rule);
  public Object visit(Rule$OCTET rule);
  public Object visit(Rule$SP rule);
  public Object visit(Rule$VCHAR rule);
  public Object visit(Rule$quoted_string rule);
  public Object visit(Rule$qcontent rule);
  public Object visit(Rule$qtext rule);
  public Object visit(Rule$obs_local_part rule);
  public Object visit(Rule$obs_domain rule);
  public Object visit(Rule$obs_FWS rule);
  public Object visit(Rule$obs_qp rule);
  public Object visit(Rule$obs_text rule);
  public Object visit(Rule$obs_char rule);
  public Object visit(Rule$CFWS rule);
  public Object visit(Rule$WSP rule);
  public Object visit(Rule$atom rule);
  public Object visit(Rule$word rule);
  public Object visit(Rule$hex4 rule);
  public Object visit(Rule$extn_addr rule);
  public Object visit(Rule$non_ws_string rule);
  public Object visit(Rule$byte_string rule);
  public Object visit(Rule$CRLF rule);
  public Object visit(Rule$token rule);
  public Object visit(Rule$ALPHA rule);
  public Object visit(Rule$DIGIT rule);
  public Object visit(Rule$POS_DIGIT rule);
  public Object visit(Rule$DQUOTE rule);
  public Object visit(org.murillo.abnf.precomp.Token rule);
  public Object visit(org.murillo.abnf.precomp.ByteString rule);
  public Object visit(org.murillo.abnf.precomp.CRLF rule);
  public Object visit(org.murillo.abnf.precomp.ALPHA rule);

  public Object visit(Terminal$StringValue value);
  public Object visit(Terminal$NumericValue value);
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
