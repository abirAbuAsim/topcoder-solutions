/*
	This problem was used for: 
	Single Round Match 191 Round 1 - Division II, Level One
*/
import java.util.*;
public class BettingMoney {
    public int moneyMade(int[] amounts, int[] centsPerDollar, int finalResult) {
    	int len = amounts.length;
        int companyLosesInCents = amounts[finalResult] * centsPerDollar[finalResult];
        amounts[finalResult] = -1;
        centsPerDollar[finalResult] = -1;
        int companyGains = 0;
        for (int I = 0; I < len; I++) {
            if (I != finalResult) {
            	companyGains += amounts[I];
            }
        }
        int companyGainsInCents = companyGains * 100;
        
        int moneyToReturn = companyGainsInCents - companyLosesInCents;
        return moneyToReturn;
    }
}