package com.ktdsuniversity.edu.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class FileReadExam { //알트 시프트 r
	
	// io는 string을 일일히 넣어줘야하는데 nio는 알아서 해줌
	
	
	/**
	 * NIO
	 * Java version >= 1.8
	 */
	public static void readAndPrintFileDescriptionUseNIO(String parentPath, String file) { // 쓰는 건 간편하지만 메모리를 많이 잡아먹는다
		// 1. 읽으려는 파일을 특정
		File target = new File(parentPath, file);
		
		
		// 2. 파일의 내용을 읽는다
		// 3. 파일의 내용을 List에 할당한다
		try {
			//Files.lines(target.toPath());  --> 메모리를 덜 먹음 나중에 함수 배우면 사용
			List<String> lines = Files.readAllLines(target.toPath());
			
			// 4. 파일의 내용을 출력한다
			for(String line: lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * IO
	 * Java version < 1.8
	 */
	public static void readAndPrintFileDescriptionUseIO(String parentPath, String file) {
		
		// 1. 읽으려는 파일을 특정
		File target = new File(parentPath, file);
		
		// 2. 파일이 존재하는지 확인
		// 3. 읽으려는 대상이 진짜 파일이 맞는지 확인
		if(target.exists() && target.isFile()) {
			// 4. 파일의 내용을 읽기 시작
			FileReader fileReader = null;
			BufferedReader bufferedReader = null;
			
			try {
				// 4-1 파일의 바이트를 Chunking해서 가져온다
				fileReader = new FileReader(target);
				
				// 4-2 파일의 내용을 String으로 변환한다
				bufferedReader = new BufferedReader(fileReader);
				
				String line = null; //한 줄 씩 읽음
				
				while(true) {
					line = bufferedReader.readLine();
					
					if(line == null) { //EOF End Of File까지 갔느냐

						break;
					}
					else {
						// 4-3 내용을 출력한다
						System.out.println(line);
					}
				}
				
			} catch (IOException ioe) {
				ioe.printStackTrace();
			} finally {
				if (bufferedReader != null) {
					try {
						bufferedReader.close();
					} catch (IOException ioe) {}
				}
				
				if(fileReader != null) {
					try {
						fileReader.close();
					} catch (IOException ioe) {}
				}
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Properties props = System.getProperties();
		String homePath = props.get("user.home").toString();
		System.out.println(homePath);
		
//		Properties props = System.getProperties(); // 운영체제의 정보를 취득
//		System.out.println(props);
//		System.out.println(props.get("user.home"));
//		
//		Map<String, String> env = System.getenv(); // 운영체제의 정보를 취득
//		System.out.println(env);
//		System.out.println(env.get("HOME"));
		
		// C:\Java Exam 폴더의 정보를 추출
		File directory = new File(homePath + File.separator + "Java Exam"); //java.io.File
		System.out.println(File.separator);

		// 1. 폴더의 이름 출력
		String directoryName = directory.getName();
		System.out.println(directoryName);
		
		// 2. 이 경로가 가리키는 것이 파일인지 폴더인지를 구분
		boolean isFile = directory.isFile(); // isFile의 값이 true이면 파일이고 false면 파일이 아니다
		System.out.println(isFile);
		
		boolean isDirectory = directory.isDirectory(); // isDirectory가 true면 폴더고 false면 폴더가 아니다
		System.out.println(isDirectory);
		
		// 3. 이 경로가 실제 존재하는 것인지
		boolean exists = directory.exists(); // exists가 true면 존재하는 폴더고 false면 존재하지 않는 폴더다
		System.out.println(exists);
		
		// 4. 이 경로의 크기(폴더의 크기) 출력
		long bytes = directory.length();
		System.out.println(bytes + "bytes");
		
		
		// C:\Java Exam\Java Exam.txt 파일의 정보를 추출
		File textFile = new File(homePath + File.separator + "Java Exam", "Java Exam.txt"); // ,기준 앞에 있는 폴더에서 ,뒤 파일을 가져와라
		
		// 1. 파일의 이름을 출력
		String textFileName = textFile.getName();
		System.out.println(textFileName);
		
		// 2. 파일이 폴더인지 파일인지 구분해서 출력
		boolean isFile2 = textFile.isFile();
		System.out.println(isFile2);
		
		boolean isDirectory2 = textFile.isDirectory();
		System.out.println(isDirectory2);
		
		
		// 3. 이 파일이 실재 존재하는 것인지
		boolean exists2 = textFile.exists();
		System.out.println(exists2);
		
		// 4. 파일의 크기를 출력한다
		long bytes2 = textFile.length();
		System.out.println(bytes2 + "bytes");
		
		
		// 5. 이 파일이 있는 부모의 경로를 출력한다
		// 5-1 방법
		String parentPath = textFile.getParent(); // parent를 통해 문자열로 받는 방법
		System.out.println(parentPath);
		
		//5-2 방법
		File parentFile = textFile.getParentFile();
		System.out.println(parentFile);
		
		// 6. 이 파일의 경로를 출력한다
		String textFilePath = textFile.getAbsolutePath();
		System.out.println(textFilePath);
		
		
		//readAndPrintFileDescriptionUseIO(homePath + File.separator + "Java Exam", "Java Exam.txt"); // 파일 이름 뒤 txt붙여져있는지 확인하기
		readAndPrintFileDescriptionUseNIO(homePath + File.separator + "Java Exam", "Java Exam.txt");
		
	}
	
}
