def call(String args) {
  sh """
    sbt -Dsbt.global.base=/.sbt \
      -Dsbt.boot.directory=\$(mktemp -d) \
      -Dsbt.ivy.home=.ivy2 \
      $args
  """
}
