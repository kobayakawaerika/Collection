package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task implements Comparable<Task> { //日付順で並べ替えを行うため、Comparableを実装
	private LocalDate date; //タスクの日付
	private String content; //タスク内容

	//Taskコンストラクタ
	public Task(LocalDate date, String content) {
		this.date = date;
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}

	public LocalDate getDate() {
		return date;
	}

	//日付を「yyyy年MM月dd日」フォーマットで表示し、タスクの内容も含め文字列で表示するようオーバーライド
	@Override
	public String toString() {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
		return date.format(f) + "" + content;
	}

	//タスクの日付で並べ替え
	public int compareTo(Task other) {
		return this.date.compareTo(other.date);
	}
}
