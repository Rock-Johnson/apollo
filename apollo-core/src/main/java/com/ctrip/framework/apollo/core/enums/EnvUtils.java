package com.ctrip.framework.apollo.core.enums;

import com.ctrip.framework.apollo.core.utils.StringUtils;

public final class EnvUtils {

  public static Env transformEnv(String envName) {
    if (StringUtils.isBlank(envName)) {
      return Env.UNKNOWN;
    }

    if("LPT".equals(envName.trim().toUpperCase())){
      return Env.LPT;
    }else if ("FAT".equals(envName.trim().toUpperCase()) || "FWS".equals(envName.trim().toUpperCase())){
      return Env.FAT;
    }else if("UAT".equals(envName.trim().toUpperCase())){
      return Env.UAT;
    }else if ("PRO".equals(envName.trim().toUpperCase()) || "PROD".equals(envName.trim().toUpperCase())){
      return Env.PRO;
    }else if("DEV".equals(envName.trim().toUpperCase())){
      return Env.DEV;
    }else if("LOCAL".equals(envName.trim().toUpperCase())){
      return Env.LOCAL;
    }else if("TOOLS".equals(envName.trim().toUpperCase())){
      return Env.TOOLS;
    }else{
      return Env.UNKNOWN;
    }


    /*switch (envName.trim().toUpperCase()) {
      case "LPT":
        return Env.LPT;
      case "FAT":
      case "FWS":
        return Env.FAT;
      case "UAT":
        return Env.UAT;
      case "PRO":
      case "PROD": //just in case
        return Env.PRO;
      case "DEV":
        return Env.DEV;
      case "LOCAL":
        return Env.LOCAL;
      case "TOOLS":
        return Env.TOOLS;
      default:
        return Env.UNKNOWN;
    }*/
  }
}
