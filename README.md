Android MVVM V2 Boilerplate
======================

# 소개
**Clean Architecture 원칙을 기반으로 MVVM + Dagger Hilt 를 적용하면서 새로운 Library 의
사용법 등을 익히고자 만들었습니다.**

# 목표
Android Architecture 구성에 대한 이해와 Clean Architecture 의 이해 및 이를 위한 Android Components, Library,
[Kotlin Flows](https://developer.android.com/kotlin/flow/stateflow-and-sharedflow) 등에 대한 심층적 이해를 하기 위한 프로젝트입니다.

아래 단계별로 프로젝트를 업데이트 해 나갈 예정입니다.
1. 기본적인 구조를 잡는 과정
2. 야놀자 앱을 클론 코딩 하는 과정
3. Compose 를 사용한 버전으로의 코드 분기

# Architecture

아키텍처는 [Android Architecture Components](https://developer.android.com/topic/libraries/architecture/)
를 이용하여 구현하였고, [Guide to App Architecture](https://developer.android.com/jetpack/docs/guide) 에
제시된 권장사항을 따라 구축하는것을 목표로 합니다.

<div>
    <img src="https://developer.android.com/static/topic/libraries/architecture/images/mad-arch-overview.png"/>
</div>

로직은 Activity 와 Fragment 에서 분리시켜 [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel)로
이동시켰습니다.

데이터의 변화는 [Kotlin Flows](https://developer.android.com/kotlin/flow/stateflow-and-sharedflow) 를
이용하여 관찰하며 관측된 데이터는 [Data Binding Library](https://developer.android.com/topic/libraries/data-binding/) 를
통해 UI Component 와 결합됩니다.

Repository Layer 는 데이터 작업을 처리합니다.
[Room](https://developer.android.com/training/data-storage/room?hl=ko) 을 이용하여 구현할 예정입니다.

## Kotlin
앱 전체를 kotlin 으로 작성하였으며, Jetpack 의 [Android Ktx extensions](https://developer.android.com/kotlin/ktx)
를 이용하였습니다.

비동기처리 작업은 [coroutines](https://developer.android.com/kotlin/coroutines) 를 이용하면 간단하고 쉽게 관리할
수 있으며 데이터 스트림의 소비는 [Kotlin Flows](https://developer.android.com/kotlin/flow)를 이용하여 처리하였습니다.

빌드 스크립트는 [Kotlin DSL](https://docs.gradle.org/current/userguide/kotlin_dsl.html) 를 이용하여 작성되었습니다.