import {
    language as hiveLanguage,
    conf as hiveConf,
} from "../worker/hivesql/language";

export const LanguageName = "hivesql";

export const LanguageMapping = {
    hivesql: {
        language: hiveLanguage,
        conf: hiveConf,
    },
};
