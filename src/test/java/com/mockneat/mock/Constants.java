package com.mockneat.mock;

import com.mockneat.types.enums.RandomType;

/**
 * Created by andreinicolinciobanu on 30/12/2016.
 */
public class Constants {

    public static final MockNeat[] MOCKS = { new MockNeat(RandomType.OLD), new MockNeat(RandomType.SECURE), new MockNeat(RandomType.THREAD_LOCAL) };
    public static final MockNeat M = MOCKS[0];

    public static final int BOOLS_CYCLES = 10000;
    public static final int CCS_CYCLES = 10000;
    public static final int CHARS_CYCLES = 10000;
    public static final int COMPOSE_CYCLES = 10000;
    public static final int CVVS_CYCLES= 10000;
    public static final int DEP_CYCLES = 10000;
    public static final int COUNTRIES_CYCLES = 10000;
    public static final int CURRENCIES_CYCLES = 10000;
    public static final int DAYS_CYCLES = 10000;
    public static final int DOMAIN_CYCLES = 10000;
    public static final int DOUBLES_CYCLES = 10000;
    public static final int EMAILS_CYCLES = 10000;
    public static final int FLOATS_CYCLES = 10000;
    public static final int FMT_CYCLES = 10000;
    public static final int INTS_CYCLES = 10000;
    public static final int IPV4S_CYCLES = 10000;
    public static final int IPV6S_CYCLES = 10000;
    public static final int LONGS_CYCLES = 10000;
    public static final int LOCAL_DATES_CYCLES = 10000;
    public static final int MONEY_CYCLES = 10000;
    public static final int NAMES_CYCLES = 10000;
    public static final int OBJS_CYCLES = 10000;
    public static final int PASS_CYCLES = 10000;
    public static final int MOCK_CYCLES = 10000;
    public static final int STRING_CYCLES = 10000;
    public static final int URL_CYCLES = 10000;
}
