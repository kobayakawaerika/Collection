package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter5 {
	public static void main(String[] args) {

		Task task1 = new Task(LocalDate.parse("2021-04-21"), "牛乳を買う。");
		Task task2 = new Task(LocalDate.parse("2021-09-15"), "○○社面談。");
		Task task3 = new Task(LocalDate.parse("2021-12-04"), "手帳を買う。");
		Task task4 = new Task(LocalDate.parse("2021-08-10"), "散髪に行く。");
		Task task5 = new Task(LocalDate.parse("2021-11-09"), "スクールの課題を解く。");

		//ArrayListを使ってタスクの日付とタスク内容をまとめて格納
		List<Task> lists = new ArrayList<>();
		lists.add(task1);
		lists.add(task2);
		lists.add(task3);
		lists.add(task4);
		lists.add(task5);

		//タスクの日付順に並べ替え
		Collections.sort(lists);

		//内容を表示
		for (Task s : lists) {
			System.out.println(s);
		}
	}
}
