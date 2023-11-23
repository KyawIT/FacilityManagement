package at.htlleonding.facilitymngmt;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class FacilityManagementException extends RuntimeException {
    public static final String ZIP_CODE_NOT_FOUND_MESSAGE = "Zip code not found";
    public static final String IO_EXCEPTION_MESSAGE = "An I/O exception occurred while reading from or writing to a file.";

    public FacilityManagementException(String message) {
        super(message);
    }

    public FacilityManagementException(String message, Throwable cause) {
        super(message, cause);
    }
}
