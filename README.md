# 스프링부트 팀프로젝트 Link

## 기획 끝

## 화면설계 끝

## 화면코드 끝

## 테이블설계

## 1단계 기능

- (특징 : 자바스크립트, 예외처리)
- 회원가입 (언주)
- 로그인 (언주)
- 기업 회원정보 수정 (언주)
- 구직자 회원정보 수정 (언주)
- 이력서 등록, 수정 (정완)
- 채용공고 지원 (정완)
- 이력서 지원현황 (정완)
- 기업공고 상세보기 (정완)
- 관심기업/기술스택 (정완)
- 기업 채용공고 등록, 수정 (언약)
- 기업 채용공고 지원현황 (언약)
- 이력서 상세보기 (언약)
- 관심구직자/기술스택 (언약)
- 고객센터 (지환)
- 고객센터 글 문의 (지환)
- 고객센터 글 댓글 (지환)
- 메인 (지환)

## 2단계 기능

- 이미지 저장 (언주)
- 유저네임 중복체크 (언주)
- 페이징하기 (지환)
- 검색하기 (지환)
- 권한체크 (언약)
- 셀렉트박스 필터 (정완)
- 기술스택 매칭 (정완)


## 3단계 기능 (24일)
- 이미지 저장 (언주)
- 필터 (언주)
- 이메일보내기 (지환)
- 알림 (언약)
- 이력서 여러개 (정완)

## 테이블 쿼리

```sql
create database blogdb;
use blogdb;

create table apply_tb (
       id integer generated by default as identity,
        pass varchar(255),
        notice_id integer,
        resume_id integer,
        user_id integer,
        primary key (id)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

create table area_tb (
       id integer generated by default as identity,
        area_name varchar(255),
        primary key (id)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

create table board_tb (
       id integer generated by default as identity,
        content clob,
        title varchar(100) not null,
        user_id integer,
        primary key (id)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

create table bookmark_tb (
       id integer generated by default as identity,
        target_id bigint,
        user_id integer,
        primary key (id)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

create table hash_area_tb (
       id integer generated by default as identity,
        area_select varchar(255),
        area_id integer,
        notice_id integer,
        resume_id integer,
        primary key (id)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

create table hash_skil_tb (
       id integer generated by default as identity,
        skill_select varchar(255),
        notice_id integer,
        resume_id integer,
        skill_id integer,
        primary key (id)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

create table notice_tb (
       id integer generated by default as identity,
        academic_ability varchar(255),
        career integer,
        content varchar(255),
        end_date timestamp,
        order_date timestamp,
        salary varchar(255),
        title varchar(255),
        type_of_work varchar(255),
        user_id integer,
        primary key (id)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

create table reply_tb (
       id integer generated by default as identity,
        comment varchar(100) not null,
        board_id integer,
        user_id integer,
        primary key (id)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

create table resume_tb (
       id integer generated by default as identity,
        career integer,
        content varchar(255),
        user_id integer,
        primary key (id)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

create table skill_tb (
       id integer generated by default as identity,
        skill_name varchar(255),
        primary key (id)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

create table user_tb (
       id integer generated by default as identity,
        address varchar(255),
        age timestamp,
        business varchar(255),
        company_user boolean,
        email varchar(255),
        form varchar(255),
        name varchar(255),
        password varchar(255),
        performance varchar(255),
        phonenumber varchar(255),
        pic_url varchar(255),
        username varchar(255),
        primary key (id)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;