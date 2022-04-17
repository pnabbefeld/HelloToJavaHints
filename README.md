# HelloToJavaHints

This is a demonstrational project, just to create some dummy project producing a Java Hint within NetBeans and to check whether it is working, and especially to check test class execution.

## Available Tutorials
1. https://netbeans.apache.org/tutorials/70/nbm-java-hint.html
2. https://netbeans.apache.org/tutorials/71/nbm-java-hint.html
3. https://netbeans.apache.org/tutorials/80/nbm-java-hint.html
4. https://netbeans.apache.org/jackpot/HintsFileFormat.html

## Implementation

### Parameters

The Java Hint is created using the first part of tutorial [3] using the following parameters:

<table>
  <tr>
    <td>Artifact</td>
    <td>HelloToJavaHints</td>
  </tr>
  <tr>
    <td>Package</td>
    <td>org.netbeans.examples.hellotojavahints</td>
  </tr>
  <tr>
    <td>Hint Display Name</td>
    <td>JOptionPane.showMessageDialog</td>
  </tr>
  <tr>
    <td>Hint Description</td>
    <td>Checks for JOptionPane.showMessageDialog.</td>
  </tr>
  <tr>
    <td>Warning Message</td>
    <td>Is JOptionPane.showMessageDialog needed?</td>
  </tr>
  <tr>
    <td>Automatic Fix</td>
    <td>None</td>
  </tr>
  <tr>
    <td>Class Name</td>
    <td>JOptionPaneHint</td>
  </tr>
</table>

### TriggerPattern Replacement

    @TriggerPattern(
            value = "$1.showMessageDialog",
            constraints = @ConstraintVariableType(
                    variable = "$1",
                    type = "javax.swing.JOptionPane")
    )

## Source Code and Results

The source code has been created using NetBeans 13 running JDK 11 on Arch Linux.

Result:
```
java.lang.NoSuchFieldError: RECORD
	at org.netbeans.api.java.source.TreeUtilities.<clinit>(TreeUtilities.java:112)
	at org.netbeans.modules.java.source.indexing.CompileWorker.computeFQNs(CompileWorker.java:62)
	at org.netbeans.modules.java.source.indexing.VanillaCompileWorker.compile(VanillaCompileWorker.java:207)
	at org.netbeans.modules.java.source.indexing.JavaCustomIndexer.index(JavaCustomIndexer.java:359)
	at org.netbeans.modules.parsing.spi.indexing.Indexable$MyAccessor$2.run(Indexable.java:138)
	at org.netbeans.modules.parsing.impl.indexing.RepositoryUpdater.runIndexer(RepositoryUpdater.java:273)
	at org.netbeans.modules.parsing.spi.indexing.Indexable$MyAccessor.index(Indexable.java:136)
	at org.netbeans.modules.parsing.impl.indexing.RepositoryUpdater$Work.doIndex(RepositoryUpdater.java:2748)
	at org.netbeans.modules.parsing.impl.indexing.RepositoryUpdater$Work.lambda$index$0(RepositoryUpdater.java:2625)
	at org.netbeans.modules.parsing.impl.indexing.errors.TaskCache.refreshTransaction(TaskCache.java:540)
	at org.netbeans.modules.parsing.impl.indexing.RepositoryUpdater$Work.index(RepositoryUpdater.java:2624)
	at org.netbeans.modules.parsing.impl.indexing.RepositoryUpdater$Work.lambda$scanFiles$4(RepositoryUpdater.java:3344)
	at org.netbeans.modules.parsing.impl.indexing.RepositoryUpdater.lambda$runInContext$4(RepositoryUpdater.java:2118)
	at org.openide.util.lookup.Lookups.executeWith(Lookups.java:279)
	at org.netbeans.modules.parsing.impl.indexing.RepositoryUpdater.runInContext(RepositoryUpdater.java:2116)
	at org.netbeans.modules.parsing.impl.indexing.RepositoryUpdater.runInContext(RepositoryUpdater.java:2097)
	at org.netbeans.modules.parsing.impl.indexing.RepositoryUpdater.access$1400(RepositoryUpdater.java:134)
	at org.netbeans.modules.parsing.impl.indexing.RepositoryUpdater$Work.scanFiles(RepositoryUpdater.java:3302)
	at org.netbeans.modules.parsing.impl.indexing.RepositoryUpdater$FileListWork.getDone(RepositoryUpdater.java:3844)
	at org.netbeans.modules.parsing.impl.indexing.RepositoryUpdater$Work.doTheWork(RepositoryUpdater.java:3464)
	at org.netbeans.modules.parsing.impl.indexing.RepositoryUpdater$Task._run(RepositoryUpdater.java:6209)
	at org.netbeans.modules.parsing.impl.indexing.RepositoryUpdater$Task.access$3400(RepositoryUpdater.java:5867)
	at org.netbeans.modules.parsing.impl.indexing.RepositoryUpdater$Task$2.lambda$call$0(RepositoryUpdater.java:6128)
	at org.openide.util.lookup.Lookups.executeWith(Lookups.java:279)
	at org.netbeans.modules.parsing.impl.RunWhenScanFinishedSupport.performScan(RunWhenScanFinishedSupport.java:83)
	at org.netbeans.modules.parsing.impl.indexing.RepositoryUpdater$Task$2.call(RepositoryUpdater.java:6128)
	at org.netbeans.modules.parsing.impl.indexing.RepositoryUpdater$Task$2.call(RepositoryUpdater.java:6124)
	at org.netbeans.modules.masterfs.filebasedfs.utils.FileChangedManager.priorityIO(FileChangedManager.java:153)
	at org.netbeans.modules.masterfs.providers.ProvidedExtensions.priorityIO(ProvidedExtensions.java:335)
	at org.netbeans.modules.parsing.nb.DataObjectEnvFactory.runPriorityIO(DataObjectEnvFactory.java:118)
	at org.netbeans.modules.parsing.impl.Utilities.runPriorityIO(Utilities.java:67)
	at org.netbeans.modules.parsing.impl.indexing.RepositoryUpdater$Task.run(RepositoryUpdater.java:6124)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at org.openide.util.RequestProcessor$Task.run(RequestProcessor.java:1418)
	at org.netbeans.modules.openide.util.GlobalLookup.execute(GlobalLookup.java:45)
	at org.openide.util.lookup.Lookups.executeWith(Lookups.java:278)
	at org.openide.util.RequestProcessor$Processor.run(RequestProcessor.java:2033)
```