## 스프링 Boilerplate (feat. JAVA)

산타 물류

### 상품

- 상품의 목록을 조회할 수 있다.
- 상품은 이름, 가격, 설명으로 구성된다.

### 부모님들

| 필드 이름            | 데이터 타입         | 설명       |
|----------------------|---------------------|----------|
| email                | String              | 부모님의 이메일 |
| encryptedPassword    | String              | 암호화된 비밀번호 |
| createdAt            | LocalDateTime       | 생성 일시    |
| updatedAt            | LocalDateTime       | 수정 일시    |

### 아이들

- 부모님들은 아이들의 주소를 등록할 수 있다.
- 부모님들은 아이들의 상품을 신청할 수 있다.
- 아이들이 성인이 되면 등록된 주소가 삭제된다.

| 필드 이름       | 데이터 타입       | 설명       |
|-------------|--------------|----------|
| name        | String       | 아이의 이름   |
| sex         | Sex          | 아이의 성별   |
| yearOfBirth | Long         | 아이의 출생연도 |
| parentId    | Long         | 부모 ID    |
| deliveryZoneId       | Long                | 배달 구역 ID        |
| createdAt   | LocalDateTime | 생성 일시    |
| updatedAt   | LocalDateTime | 수정 일시    |

### 산타

- 산타들은 아이들의 상품을 배달할 수 있다.
- 산타들은 상품을 배달하면 확인 체크를 해야한다.
- 산타들은 배달할 상품을 배정받는다.

| 필드 이름            | 데이터 타입         | 설명                |
|----------------------|---------------------|---------------------|
| email                | String              | 산타의 이메일       |
| encryptedPassword    | String              | 암호화된 비밀번호   |
| deliveryZoneId       | Long                | 배달 구역 ID        |
| createdAt            | LocalDateTime       | 생성 일시           |
| updatedAt            | LocalDateTime       | 수정 일시           |


### 주문
- 부모님들은 상품을 주문할 수 있다.
- 상품의 목록에 없는 것을 신청할 수 있다.
    - 상품의 이름에는 비속어가 포함될 수 없다.
    - 신청이 거절될 수 있다.