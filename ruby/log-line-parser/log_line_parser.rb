class LogLineParser
  def initialize(line)
    @line = line
    @segments = @line.split(':')
  end

  def message
    @segments[1].strip
  end

  def log_level
    @segments[0].slice(1..-2).downcase
  end

  def reformat
    "#{self.message} (#{self.log_level})"
  end
end
