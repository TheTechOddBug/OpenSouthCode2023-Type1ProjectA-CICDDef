#!/usr/bin/env groovy

def getProjectInfo() {

  def projectCICDDef = [:]
  def theProjectPipelineStagesDef = [:]

  def theProjectRepo = 'https://github.com/TheTechOddBug/OpenSouthCode2023-Type1ProjectA.git'
  def theProjectType = 'projectType1'

  theProjectPipelineStagesDef.put(10, ['ProjectA - Stage 1 - OvWr', { println 'Overwriting stageOne in ProjectA.' }])
  theProjectPipelineStagesDef.put(15, ['ProjectA - New Stage 1.5', { println 'New pipeline stage by ProjectA.' }])

  projectCICDDef.projectRepo = theProjectRepo
  projectCICDDef.projectType = theProjectType
  projectCICDDef.projectPipelineStagesDef = theProjectPipelineStagesDef

  return projectCICDDef
}
