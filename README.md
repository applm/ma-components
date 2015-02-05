Coverflow
=============
### Description
Android CoverFlow widget with demo.
Forked from [applm/ma-components](https://github.com/applm/ma-components).

### Screenshot
![Demo](art/screenshot.png)


### Code Samples
For example, in your layout:

```xml
<it.moondroid.coverflow.components.ui.containers.FeatureCoverFlow
        android:id="@+id/coverflow"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        coverflow:coverHeight="@dimen/cover_height"
        coverflow:coverWidth="@dimen/cover_width"
        coverflow:maxScaleFactor="1.5"
        coverflow:reflectionGap="0px"
        coverflow:rotationThreshold="0.5"
        coverflow:scalingThreshold="0.5"
        coverflow:spacing="0.6" />
```


then in your Activity:

```java
        mCoverFlow = (FeatureCoverFlow) findViewById(R.id.coverflow);
        mCoverFlow.setAdapter(mAdapter);

        mCoverFlow.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //TODO CoverFlow item clicked
            }
        });

        mCoverFlow.setOnScrollPositionListener(new FeatureCoverFlow.OnScrollPositionListener() {
            @Override
            public void onScrolledToPosition(int position) {
                //TODO CoverFlow stopped to position
            }

            @Override
            public void onScrolling() {
                //TODO CoverFlow began scrolling
            }
        });
```

