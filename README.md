# animationvectornanrepro

![video](video.mp4)

```
08:26:18.219  E  FATAL EXCEPTION: main
                 Process: se.bankgirot.swish.dev.debug, PID: 9804
                 java.lang.IllegalStateException: AnimationVector cannot contain a NaN. AnimationVector1D: value = NaN. Animation: TargetBasedAnimation: 0.0 -> NaN,initial velocity: AnimationVector1D: value = 3073.6543, duration: 300 ms,animationSpec: androidx.compose.animation.core.VectorizedTweenSpec@3db83cb, playTimeNanos: 0
                 	at androidx.compose.animation.core.TargetBasedAnimation.getValueFromNanos(Animation.kt:243)
                 	at androidx.compose.animation.core.SuspendAnimationKt.animate(SuspendAnimation.kt:233)
                 	at androidx.compose.animation.core.SuspendAnimationKt.animateTo(SuspendAnimation.kt:159)
                 	at androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateWithTarget(SnapFlingBehavior.kt:409)
                 	at androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.access$animateWithTarget(SnapFlingBehavior.kt:1)
                 	at androidx.compose.foundation.gestures.snapping.LowVelocityApproachAnimation.approachAnimation(SnapFlingBehavior.kt:467)
                 	at androidx.compose.foundation.gestures.snapping.LowVelocityApproachAnimation.approachAnimation(SnapFlingBehavior.kt:454)
                 	at androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.approach(SnapFlingBehavior.kt:321)
                 	at androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.access$approach(SnapFlingBehavior.kt:1)
                 	at androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.runApproach(SnapFlingBehavior.kt:236)
                 	at androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.tryApproach(SnapFlingBehavior.kt:213)
                 	at androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.access$tryApproach(SnapFlingBehavior.kt:71)
                 	at androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1.invokeSuspend(SnapFlingBehavior.kt:174)
                 	at androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1.invoke(Unknown Source:8)
                 	at androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1.invoke(Unknown Source:4)
                 	at kotlinx.coroutines.intrinsics.UndispatchedKt.startUndispatchedOrReturn(Undispatched.kt:78)
                 	at kotlinx.coroutines.BuildersKt__Builders_commonKt.withContext(Builders.common.kt:167)
                 	at kotlinx.coroutines.BuildersKt.withContext(Unknown Source:1)
                 	at androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.fling(SnapFlingBehavior.kt:165)
                 	at androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.performFling(SnapFlingBehavior.kt:151)
                 	at androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.performFling(SnapFlingBehavior.kt:130)
                 	at androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2.invokeSuspend(Scrollable.kt:844)
                 	at androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2.invoke(Unknown Source:8)
                 	at androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2.invoke(Unknown Source:4)
                 	at androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1.invokeSuspend(ScrollableState.kt:181)
                 	at androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1.invoke(Unknown Source:8)
                 	at androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1.invoke(Unknown Source:4)
                 	at androidx.compose.foundation.MutatorMutex$mutateWith$2.invokeSuspend(MutatorMutex.kt:173)
                 	at androidx.compose.foundation.MutatorMutex$mutateWith$2.invoke(Unknown Source:8)
                 	at androidx.compose.foundation.MutatorMutex$mutateWith$2.invoke(Unknown Source:4)
                 	at kotlinx.coroutines.intrinsics.UndispatchedKt.startUndispatchedOrReturn(Undispatched.kt:78)
                 	at kotlinx.coroutines.CoroutineScopeKt.coroutineScope(CoroutineScope.kt:264)
                 	at androidx.compose.foundation.MutatorMutex.mutateWith(MutatorMutex.kt:166)
                 	at androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2.invokeSuspend(ScrollableState.kt:178)
                 	at androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2.invoke(Unknown Source:8)
                 	at androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2.invoke(Unknown Source:4)
```
