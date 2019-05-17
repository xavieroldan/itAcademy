package com.videos.project.views;
// Class to launch a exception in blank fields required

/**
 *
 * @author Xavier Roldán <info@xavierroldan.com>
 */
public class Exceptions extends Exception
{
    public Exceptions()
    {
    }

    public Exceptions(String error)
    {
        super(error);
    }
}
