package com.javaex.problem06;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Friend[] friendArray = new Friend[3];
		Scanner sc = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요");

		for (int i = 0; i < friendArray.length; i++) {

			String info = sc.nextLine();
			String str[] = info.split(" ");

			friendArray[i]= new Friend();
			
			friendArray[i].setName(str[0]);
			friendArray[i].setHp(str[1]);
			friendArray[i].setSchool(str[2]);

			
			
			/*			friends.setName(str[0]);
			friends.setHp(str[1]);
			friends.setSchool(str[2]);

			friendArray[i] = friends;*/
			

			//		Friend friends = new Friend(info.split(" ")[0],);
					
		}

		// 친구정보 입력받기

		// 입력받은 친구정보를 공백으로 분리

		// Friend 객체 생성하여 데이터 넣기

		// 배열에 추가하기

		// 친구정보 출력
		for (int i = 0; i < friendArray.length; i++) {

			friendArray[i].showInfo();
			// 친구정보 출력 메소드 호출
		}

		sc.close();
	}

}
