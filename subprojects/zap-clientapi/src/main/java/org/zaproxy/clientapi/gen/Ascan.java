/* Zed Attack Proxy (ZAP) and its related class files.
 *
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 *
 * Copyright 2016 the ZAP development team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.zaproxy.clientapi.gen;

import java.util.HashMap;
import java.util.Map;
import org.zaproxy.clientapi.core.ApiResponse;
import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;


/**
 * This file was automatically generated.
 */
@SuppressWarnings("javadoc")
public class Ascan extends org.zaproxy.clientapi.gen.deprecated.AscanDeprecated {

	private final ClientApi api;

	public Ascan(ClientApi api) {
		super(api);
		this.api = api;
	}

	public ApiResponse status(String scanid) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		if (scanid != null) {
			map.put("scanId", scanid);
		}
		return api.callApi("ascan", "view", "status", map);
	}

	public ApiResponse scanProgress(String scanid) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		if (scanid != null) {
			map.put("scanId", scanid);
		}
		return api.callApi("ascan", "view", "scanProgress", map);
	}

	public ApiResponse messagesIds(String scanid) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("scanId", scanid);
		return api.callApi("ascan", "view", "messagesIds", map);
	}

	public ApiResponse alertsIds(String scanid) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("scanId", scanid);
		return api.callApi("ascan", "view", "alertsIds", map);
	}

	public ApiResponse scans() throws ClientApiException {
		return api.callApi("ascan", "view", "scans", null);
	}

	public ApiResponse scanPolicyNames() throws ClientApiException {
		return api.callApi("ascan", "view", "scanPolicyNames", null);
	}

	public ApiResponse excludedFromScan() throws ClientApiException {
		return api.callApi("ascan", "view", "excludedFromScan", null);
	}

	public ApiResponse scanners(String scanpolicyname, String policyid) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		if (scanpolicyname != null) {
			map.put("scanPolicyName", scanpolicyname);
		}
		if (policyid != null) {
			map.put("policyId", policyid);
		}
		return api.callApi("ascan", "view", "scanners", map);
	}

	public ApiResponse policies(String scanpolicyname, String policyid) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		if (scanpolicyname != null) {
			map.put("scanPolicyName", scanpolicyname);
		}
		if (policyid != null) {
			map.put("policyId", policyid);
		}
		return api.callApi("ascan", "view", "policies", map);
	}

	public ApiResponse attackModeQueue() throws ClientApiException {
		return api.callApi("ascan", "view", "attackModeQueue", null);
	}

	public ApiResponse optionAttackPolicy() throws ClientApiException {
		return api.callApi("ascan", "view", "optionAttackPolicy", null);
	}

	public ApiResponse optionDefaultPolicy() throws ClientApiException {
		return api.callApi("ascan", "view", "optionDefaultPolicy", null);
	}

	public ApiResponse optionDelayInMs() throws ClientApiException {
		return api.callApi("ascan", "view", "optionDelayInMs", null);
	}

	public ApiResponse optionExcludedParamList() throws ClientApiException {
		return api.callApi("ascan", "view", "optionExcludedParamList", null);
	}

	public ApiResponse optionHandleAntiCSRFTokens() throws ClientApiException {
		return api.callApi("ascan", "view", "optionHandleAntiCSRFTokens", null);
	}

	public ApiResponse optionHostPerScan() throws ClientApiException {
		return api.callApi("ascan", "view", "optionHostPerScan", null);
	}

	public ApiResponse optionMaxChartTimeInMins() throws ClientApiException {
		return api.callApi("ascan", "view", "optionMaxChartTimeInMins", null);
	}

	public ApiResponse optionMaxResultsToList() throws ClientApiException {
		return api.callApi("ascan", "view", "optionMaxResultsToList", null);
	}

	public ApiResponse optionMaxScansInUI() throws ClientApiException {
		return api.callApi("ascan", "view", "optionMaxScansInUI", null);
	}

	public ApiResponse optionTargetParamsEnabledRPC() throws ClientApiException {
		return api.callApi("ascan", "view", "optionTargetParamsEnabledRPC", null);
	}

	public ApiResponse optionTargetParamsInjectable() throws ClientApiException {
		return api.callApi("ascan", "view", "optionTargetParamsInjectable", null);
	}

	public ApiResponse optionThreadPerHost() throws ClientApiException {
		return api.callApi("ascan", "view", "optionThreadPerHost", null);
	}

	public ApiResponse optionAllowAttackOnStart() throws ClientApiException {
		return api.callApi("ascan", "view", "optionAllowAttackOnStart", null);
	}

	public ApiResponse optionInjectPluginIdInHeader() throws ClientApiException {
		return api.callApi("ascan", "view", "optionInjectPluginIdInHeader", null);
	}

	public ApiResponse optionPromptInAttackMode() throws ClientApiException {
		return api.callApi("ascan", "view", "optionPromptInAttackMode", null);
	}

	public ApiResponse optionPromptToClearFinishedScans() throws ClientApiException {
		return api.callApi("ascan", "view", "optionPromptToClearFinishedScans", null);
	}

	public ApiResponse optionRescanInAttackMode() throws ClientApiException {
		return api.callApi("ascan", "view", "optionRescanInAttackMode", null);
	}

	/**
	 * Tells whether or not the HTTP Headers of all requests should be scanned. Not just requests that send parameters, through the query or request body.
	 */
	public ApiResponse optionScanHeadersAllRequests() throws ClientApiException {
		return api.callApi("ascan", "view", "optionScanHeadersAllRequests", null);
	}

	public ApiResponse optionShowAdvancedDialog() throws ClientApiException {
		return api.callApi("ascan", "view", "optionShowAdvancedDialog", null);
	}

	public ApiResponse scan(String url, String recurse, String inscopeonly, String scanpolicyname, String method, String postdata) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("url", url);
		if (recurse != null) {
			map.put("recurse", recurse);
		}
		if (inscopeonly != null) {
			map.put("inScopeOnly", inscopeonly);
		}
		if (scanpolicyname != null) {
			map.put("scanPolicyName", scanpolicyname);
		}
		if (method != null) {
			map.put("method", method);
		}
		if (postdata != null) {
			map.put("postData", postdata);
		}
		return api.callApi("ascan", "action", "scan", map);
	}

	/**
	 * Active Scans from the perspective of a User, obtained using the given Context ID and User ID. See 'scan' action for more details.
	 */
	public ApiResponse scanAsUser(String url, String contextid, String userid, String recurse, String scanpolicyname, String method, String postdata) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("url", url);
		map.put("contextId", contextid);
		map.put("userId", userid);
		if (recurse != null) {
			map.put("recurse", recurse);
		}
		if (scanpolicyname != null) {
			map.put("scanPolicyName", scanpolicyname);
		}
		if (method != null) {
			map.put("method", method);
		}
		if (postdata != null) {
			map.put("postData", postdata);
		}
		return api.callApi("ascan", "action", "scanAsUser", map);
	}

	public ApiResponse pause(String scanid) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("scanId", scanid);
		return api.callApi("ascan", "action", "pause", map);
	}

	public ApiResponse resume(String scanid) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("scanId", scanid);
		return api.callApi("ascan", "action", "resume", map);
	}

	public ApiResponse stop(String scanid) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("scanId", scanid);
		return api.callApi("ascan", "action", "stop", map);
	}

	public ApiResponse removeScan(String scanid) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("scanId", scanid);
		return api.callApi("ascan", "action", "removeScan", map);
	}

	public ApiResponse pauseAllScans() throws ClientApiException {
		return api.callApi("ascan", "action", "pauseAllScans", null);
	}

	public ApiResponse resumeAllScans() throws ClientApiException {
		return api.callApi("ascan", "action", "resumeAllScans", null);
	}

	public ApiResponse stopAllScans() throws ClientApiException {
		return api.callApi("ascan", "action", "stopAllScans", null);
	}

	public ApiResponse removeAllScans() throws ClientApiException {
		return api.callApi("ascan", "action", "removeAllScans", null);
	}

	public ApiResponse clearExcludedFromScan() throws ClientApiException {
		return api.callApi("ascan", "action", "clearExcludedFromScan", null);
	}

	public ApiResponse excludeFromScan(String regex) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("regex", regex);
		return api.callApi("ascan", "action", "excludeFromScan", map);
	}

	public ApiResponse enableAllScanners(String scanpolicyname) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		if (scanpolicyname != null) {
			map.put("scanPolicyName", scanpolicyname);
		}
		return api.callApi("ascan", "action", "enableAllScanners", map);
	}

	public ApiResponse disableAllScanners(String scanpolicyname) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		if (scanpolicyname != null) {
			map.put("scanPolicyName", scanpolicyname);
		}
		return api.callApi("ascan", "action", "disableAllScanners", map);
	}

	public ApiResponse enableScanners(String ids, String scanpolicyname) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("ids", ids);
		if (scanpolicyname != null) {
			map.put("scanPolicyName", scanpolicyname);
		}
		return api.callApi("ascan", "action", "enableScanners", map);
	}

	public ApiResponse disableScanners(String ids, String scanpolicyname) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("ids", ids);
		if (scanpolicyname != null) {
			map.put("scanPolicyName", scanpolicyname);
		}
		return api.callApi("ascan", "action", "disableScanners", map);
	}

	public ApiResponse setEnabledPolicies(String ids, String scanpolicyname) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("ids", ids);
		if (scanpolicyname != null) {
			map.put("scanPolicyName", scanpolicyname);
		}
		return api.callApi("ascan", "action", "setEnabledPolicies", map);
	}

	public ApiResponse setPolicyAttackStrength(String id, String attackstrength, String scanpolicyname) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("id", id);
		map.put("attackStrength", attackstrength);
		if (scanpolicyname != null) {
			map.put("scanPolicyName", scanpolicyname);
		}
		return api.callApi("ascan", "action", "setPolicyAttackStrength", map);
	}

	public ApiResponse setPolicyAlertThreshold(String id, String alertthreshold, String scanpolicyname) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("id", id);
		map.put("alertThreshold", alertthreshold);
		if (scanpolicyname != null) {
			map.put("scanPolicyName", scanpolicyname);
		}
		return api.callApi("ascan", "action", "setPolicyAlertThreshold", map);
	}

	public ApiResponse setScannerAttackStrength(String id, String attackstrength, String scanpolicyname) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("id", id);
		map.put("attackStrength", attackstrength);
		if (scanpolicyname != null) {
			map.put("scanPolicyName", scanpolicyname);
		}
		return api.callApi("ascan", "action", "setScannerAttackStrength", map);
	}

	public ApiResponse setScannerAlertThreshold(String id, String alertthreshold, String scanpolicyname) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("id", id);
		map.put("alertThreshold", alertthreshold);
		if (scanpolicyname != null) {
			map.put("scanPolicyName", scanpolicyname);
		}
		return api.callApi("ascan", "action", "setScannerAlertThreshold", map);
	}

	public ApiResponse addScanPolicy(String scanpolicyname) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("scanPolicyName", scanpolicyname);
		return api.callApi("ascan", "action", "addScanPolicy", map);
	}

	public ApiResponse removeScanPolicy(String scanpolicyname) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("scanPolicyName", scanpolicyname);
		return api.callApi("ascan", "action", "removeScanPolicy", map);
	}

	public ApiResponse setOptionAttackPolicy(String string) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("String", string);
		return api.callApi("ascan", "action", "setOptionAttackPolicy", map);
	}

	public ApiResponse setOptionDefaultPolicy(String string) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("String", string);
		return api.callApi("ascan", "action", "setOptionDefaultPolicy", map);
	}

	public ApiResponse setOptionAllowAttackOnStart(boolean bool) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("Boolean", Boolean.toString(bool));
		return api.callApi("ascan", "action", "setOptionAllowAttackOnStart", map);
	}

	public ApiResponse setOptionDelayInMs(int i) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("Integer", Integer.toString(i));
		return api.callApi("ascan", "action", "setOptionDelayInMs", map);
	}

	public ApiResponse setOptionHandleAntiCSRFTokens(boolean bool) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("Boolean", Boolean.toString(bool));
		return api.callApi("ascan", "action", "setOptionHandleAntiCSRFTokens", map);
	}

	public ApiResponse setOptionHostPerScan(int i) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("Integer", Integer.toString(i));
		return api.callApi("ascan", "action", "setOptionHostPerScan", map);
	}

	public ApiResponse setOptionInjectPluginIdInHeader(boolean bool) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("Boolean", Boolean.toString(bool));
		return api.callApi("ascan", "action", "setOptionInjectPluginIdInHeader", map);
	}

	public ApiResponse setOptionMaxChartTimeInMins(int i) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("Integer", Integer.toString(i));
		return api.callApi("ascan", "action", "setOptionMaxChartTimeInMins", map);
	}

	public ApiResponse setOptionMaxResultsToList(int i) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("Integer", Integer.toString(i));
		return api.callApi("ascan", "action", "setOptionMaxResultsToList", map);
	}

	public ApiResponse setOptionMaxScansInUI(int i) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("Integer", Integer.toString(i));
		return api.callApi("ascan", "action", "setOptionMaxScansInUI", map);
	}

	public ApiResponse setOptionPromptInAttackMode(boolean bool) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("Boolean", Boolean.toString(bool));
		return api.callApi("ascan", "action", "setOptionPromptInAttackMode", map);
	}

	public ApiResponse setOptionPromptToClearFinishedScans(boolean bool) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("Boolean", Boolean.toString(bool));
		return api.callApi("ascan", "action", "setOptionPromptToClearFinishedScans", map);
	}

	public ApiResponse setOptionRescanInAttackMode(boolean bool) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("Boolean", Boolean.toString(bool));
		return api.callApi("ascan", "action", "setOptionRescanInAttackMode", map);
	}

	/**
	 * Sets whether or not the HTTP Headers of all requests should be scanned. Not just requests that send parameters, through the query or request body.
	 */
	public ApiResponse setOptionScanHeadersAllRequests(boolean bool) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("Boolean", Boolean.toString(bool));
		return api.callApi("ascan", "action", "setOptionScanHeadersAllRequests", map);
	}

	public ApiResponse setOptionShowAdvancedDialog(boolean bool) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("Boolean", Boolean.toString(bool));
		return api.callApi("ascan", "action", "setOptionShowAdvancedDialog", map);
	}

	public ApiResponse setOptionTargetParamsEnabledRPC(int i) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("Integer", Integer.toString(i));
		return api.callApi("ascan", "action", "setOptionTargetParamsEnabledRPC", map);
	}

	public ApiResponse setOptionTargetParamsInjectable(int i) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("Integer", Integer.toString(i));
		return api.callApi("ascan", "action", "setOptionTargetParamsInjectable", map);
	}

	public ApiResponse setOptionThreadPerHost(int i) throws ClientApiException {
		Map<String, String> map = new HashMap<>();
		map.put("Integer", Integer.toString(i));
		return api.callApi("ascan", "action", "setOptionThreadPerHost", map);
	}

}
