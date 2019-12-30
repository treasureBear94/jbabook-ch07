# jbabook-ch07

#### 상속 관계 매핑

데이터베이스에는 객체에서 다루는 상속 개념이 없기 때문에, 상속을 풀어내기 위한 다양한 방법이 있다. 

1. 각각의 테이블로 변환(조인 전략): 부모, 자식 테이블을 각각 만들고, 조회할 때 조인 

    - 부모 테이블의 기본 키를 받아, 기본 키 + 외래 키 전략
    
    - 테이블은 타입의 개념이 없으므로, 부모 테이블의 자식의 타입을 표시할 컬럼(DTYPE) 추가

2. 통합 테이블로 변환(단일 테이블 전략): 테이블을 하나만 사용해 통합

3. 서브타입 테이블로 변환(구현 클래스마다 테이블 전략): 자식 테이블을 만들고, 각 자식 테이블에 부모 정보 포함 

