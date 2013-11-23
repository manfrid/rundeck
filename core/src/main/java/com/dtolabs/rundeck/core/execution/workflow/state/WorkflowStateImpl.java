package com.dtolabs.rundeck.core.execution.workflow.state;

import java.util.*;

/**
 * $INTERFACE is ... User: greg Date: 10/15/13 Time: 3:35 PM
 */
public class WorkflowStateImpl implements WorkflowState {
    private List<String> nodeSet;
    private List<String> allNodes;
    private long stepCount;
    private ExecutionState executionState;
    private Date timestamp;
    private Date startTime;
    private Date endTime;
    private ArrayList<WorkflowStepState> stepStates;
    private Map<String, WorkflowNodeState> nodeStates;

    public WorkflowStateImpl(
            List<String> nodeSet,
            List<String> allNodes,
            long stepCount, ExecutionState executionState,
            Date timestamp,
            Date startTime,
            Date endTime,
            List<WorkflowStepState> stepStates,
            Map<String, WorkflowNodeState> nodeStates
    ) {
        this.setNodeSet(nodeSet);
        this.setAllNodes(allNodes);
        this.setStepCount(stepCount);
        this.setExecutionState(executionState);
        this.setTimestamp(timestamp);
        this.setStartTime(startTime);
        this.setEndTime(endTime);
        if(null!=stepStates){
            this.setStepStates(new ArrayList<WorkflowStepState>(stepStates));
        }
        this.setNodeStates(nodeStates);
    }

    public List<String> getNodeSet() {
        return nodeSet;
    }

    public long getStepCount() {
        return stepCount;
    }

    public ExecutionState getExecutionState() {
        return executionState;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public List<WorkflowStepState> getStepStates() {
        return stepStates;
    }

    public void setNodeSet(List<String> nodeSet) {
        this.nodeSet = new ArrayList<String>(nodeSet);
    }

    public void setStepCount(long stepCount) {
        this.stepCount = stepCount;
    }

    public void setExecutionState(ExecutionState executionState) {
        this.executionState = executionState;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public void setStepStates(ArrayList<WorkflowStepState> stepStates) {
        this.stepStates = stepStates;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public List<String> getAllNodes() {
        return allNodes;
    }

    public void setAllNodes(List<String> allNodes) {
        this.allNodes = allNodes;
    }

    public Map<String, WorkflowNodeState> getNodeStates() {
        return nodeStates;
    }

    public void setNodeStates(Map<String, WorkflowNodeState> nodeStates) {
        this.nodeStates = nodeStates;
    }
}
