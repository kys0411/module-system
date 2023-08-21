# module-system

https://www.baeldung.com/project-jigsaw-java-modularity 사이트에 나온 모듈 구조 설계 실습 repo 입니다.

## 프로젝트 구조

|----model  
|   |----src
|      |----module-info.java  
|      |----model       
|         |----Student.java  
|----service  
|   |----src
|      |----module-info.java  
|      |----service       
|         |----StudentService.java  
|----dbimpl  
|   |----src
|      |----module-info.java  
|      |----dbimpl       
|         |----StudentDbService.java  
|----client  
|   |----src
|      |----module-info.java  
|      |----client       
|         |----StudentClient.java  
