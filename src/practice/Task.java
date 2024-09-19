package practice;

import java.time.LocalDate;

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
		return this.date;
	}

	//日付と、タスクの内容も含め文字列で表示するようオーバーライド
	@Override
	public String toString() {
		return this.date + ":" + this.content;
	}

	//タスクの日付で並べ替え
	public int compareTo(Task other) {
		return this.date.compareTo(other.date);
	}
}
