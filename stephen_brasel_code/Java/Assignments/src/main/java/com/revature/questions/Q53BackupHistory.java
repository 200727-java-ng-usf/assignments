package com.revature.questions;

import java.util.Arrays;

public class Q53BackupHistory {

	int[] backupHistory(int[] creationTimes, int[][] backupRequests, int k, int t) {
		int[] ret = new int[creationTimes.length];
		Arrays.fill(ret, 0);
		for(int i = 0; i < creationTimes.length; i++){
			int timeStopped = t, numBackups = 0;
			for(int j = 0; j < backupRequests.length; j++){
				if(backupRequests[j][1] == i && backupRequests[j][0] == 0 && timeStopped >= backupRequests[j][2]){
					timeStopped = backupRequests[j][2];
					System.out.print((timeStopped-creationTimes[i]) + " ");
					if((timeStopped-creationTimes[i]) % k == 0) numBackups = -1;
				}
			}
			int timeAlive = timeStopped-creationTimes[i];
			if(timeAlive < 0) timeAlive = 0;
			System.out.print(timeAlive + " ");

			numBackups += (timeAlive) / k;
			System.out.print(numBackups + " ");
			for(int j = 0; j < backupRequests.length; j++){
				if(backupRequests[j][1] == i && backupRequests[j][0] == 1 && backupRequests[j][2] <= timeStopped){
					int backupTime = Math.abs(backupRequests[j][2] - creationTimes[i]);
					System.out.print(backupRequests[j][2] + " " + ((backupTime) % k) + " ");
					if(backupTime > 0 && (backupTime % k) != 0 || backupRequests[j][2] == creationTimes[i]) {
						numBackups++;
					}
				}
			}
			ret[i] = numBackups;
			System.out.println();
		}

		return ret;
	}
}
