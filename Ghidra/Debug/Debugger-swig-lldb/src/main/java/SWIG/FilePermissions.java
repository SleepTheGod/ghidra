/* ###
 * IP: Apache License 2.0 with LLVM Exceptions
 */
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package SWIG;

public final class FilePermissions {
  public final static FilePermissions eFilePermissionsUserRead = new FilePermissions("eFilePermissionsUserRead", lldbJNI.eFilePermissionsUserRead_get());
  public final static FilePermissions eFilePermissionsUserWrite = new FilePermissions("eFilePermissionsUserWrite", lldbJNI.eFilePermissionsUserWrite_get());
  public final static FilePermissions eFilePermissionsUserExecute = new FilePermissions("eFilePermissionsUserExecute", lldbJNI.eFilePermissionsUserExecute_get());
  public final static FilePermissions eFilePermissionsGroupRead = new FilePermissions("eFilePermissionsGroupRead", lldbJNI.eFilePermissionsGroupRead_get());
  public final static FilePermissions eFilePermissionsGroupWrite = new FilePermissions("eFilePermissionsGroupWrite", lldbJNI.eFilePermissionsGroupWrite_get());
  public final static FilePermissions eFilePermissionsGroupExecute = new FilePermissions("eFilePermissionsGroupExecute", lldbJNI.eFilePermissionsGroupExecute_get());
  public final static FilePermissions eFilePermissionsWorldRead = new FilePermissions("eFilePermissionsWorldRead", lldbJNI.eFilePermissionsWorldRead_get());
  public final static FilePermissions eFilePermissionsWorldWrite = new FilePermissions("eFilePermissionsWorldWrite", lldbJNI.eFilePermissionsWorldWrite_get());
  public final static FilePermissions eFilePermissionsWorldExecute = new FilePermissions("eFilePermissionsWorldExecute", lldbJNI.eFilePermissionsWorldExecute_get());
  public final static FilePermissions eFilePermissionsUserRW = new FilePermissions("eFilePermissionsUserRW", lldbJNI.eFilePermissionsUserRW_get());
  public final static FilePermissions eFileFilePermissionsUserRX = new FilePermissions("eFileFilePermissionsUserRX", lldbJNI.eFileFilePermissionsUserRX_get());
  public final static FilePermissions eFilePermissionsUserRWX = new FilePermissions("eFilePermissionsUserRWX", lldbJNI.eFilePermissionsUserRWX_get());
  public final static FilePermissions eFilePermissionsGroupRW = new FilePermissions("eFilePermissionsGroupRW", lldbJNI.eFilePermissionsGroupRW_get());
  public final static FilePermissions eFilePermissionsGroupRX = new FilePermissions("eFilePermissionsGroupRX", lldbJNI.eFilePermissionsGroupRX_get());
  public final static FilePermissions eFilePermissionsGroupRWX = new FilePermissions("eFilePermissionsGroupRWX", lldbJNI.eFilePermissionsGroupRWX_get());
  public final static FilePermissions eFilePermissionsWorldRW = new FilePermissions("eFilePermissionsWorldRW", lldbJNI.eFilePermissionsWorldRW_get());
  public final static FilePermissions eFilePermissionsWorldRX = new FilePermissions("eFilePermissionsWorldRX", lldbJNI.eFilePermissionsWorldRX_get());
  public final static FilePermissions eFilePermissionsWorldRWX = new FilePermissions("eFilePermissionsWorldRWX", lldbJNI.eFilePermissionsWorldRWX_get());
  public final static FilePermissions eFilePermissionsEveryoneR = new FilePermissions("eFilePermissionsEveryoneR", lldbJNI.eFilePermissionsEveryoneR_get());
  public final static FilePermissions eFilePermissionsEveryoneW = new FilePermissions("eFilePermissionsEveryoneW", lldbJNI.eFilePermissionsEveryoneW_get());
  public final static FilePermissions eFilePermissionsEveryoneX = new FilePermissions("eFilePermissionsEveryoneX", lldbJNI.eFilePermissionsEveryoneX_get());
  public final static FilePermissions eFilePermissionsEveryoneRW = new FilePermissions("eFilePermissionsEveryoneRW", lldbJNI.eFilePermissionsEveryoneRW_get());
  public final static FilePermissions eFilePermissionsEveryoneRX = new FilePermissions("eFilePermissionsEveryoneRX", lldbJNI.eFilePermissionsEveryoneRX_get());
  public final static FilePermissions eFilePermissionsEveryoneRWX = new FilePermissions("eFilePermissionsEveryoneRWX", lldbJNI.eFilePermissionsEveryoneRWX_get());
  public final static FilePermissions eFilePermissionsFileDefault = new FilePermissions("eFilePermissionsFileDefault", lldbJNI.eFilePermissionsFileDefault_get());
  public final static FilePermissions eFilePermissionsDirectoryDefault = new FilePermissions("eFilePermissionsDirectoryDefault", lldbJNI.eFilePermissionsDirectoryDefault_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static FilePermissions swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + FilePermissions.class + " with value " + swigValue);
  }

  private FilePermissions(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private FilePermissions(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private FilePermissions(String swigName, FilePermissions swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static FilePermissions[] swigValues = { eFilePermissionsUserRead, eFilePermissionsUserWrite, eFilePermissionsUserExecute, eFilePermissionsGroupRead, eFilePermissionsGroupWrite, eFilePermissionsGroupExecute, eFilePermissionsWorldRead, eFilePermissionsWorldWrite, eFilePermissionsWorldExecute, eFilePermissionsUserRW, eFileFilePermissionsUserRX, eFilePermissionsUserRWX, eFilePermissionsGroupRW, eFilePermissionsGroupRX, eFilePermissionsGroupRWX, eFilePermissionsWorldRW, eFilePermissionsWorldRX, eFilePermissionsWorldRWX, eFilePermissionsEveryoneR, eFilePermissionsEveryoneW, eFilePermissionsEveryoneX, eFilePermissionsEveryoneRW, eFilePermissionsEveryoneRX, eFilePermissionsEveryoneRWX, eFilePermissionsFileDefault, eFilePermissionsDirectoryDefault };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

