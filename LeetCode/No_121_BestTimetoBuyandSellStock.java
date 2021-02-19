package LeetCode;

public class No_121_BestTimetoBuyandSellStock {
	public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        
        for(int i = 0; i < prices.length; i++) {
        	if(prices[i] < min) min = prices[i];
        	else if(prices[i] - min > max) max = prices[i] - min;
        }
        
        return max;
    }
	//Runtime: 1 ms, faster than 98.84% 
	//Memory Usage: 52.4 MB, less than 30.51% 
	
	//ó���� 2�� for�� ��� >> �ð��ʰ�
	//�����Ѱ� ���� for�� ��� �ؾ��ұ� ������
	//prices���� max���� ���� Ŭ���� prices�� ���� �ΰ��� i�� j��� �����Ѵ�.
	// i�� j������ prices���� prices[i]�� prices[j] ������ ������ �����Ѵ�.
	// ���� min���� ���ǵɶ����� ���ο� max���� ���ǵ��� �ʴ´ٸ� max���� ������� �ʴ´�.
}
